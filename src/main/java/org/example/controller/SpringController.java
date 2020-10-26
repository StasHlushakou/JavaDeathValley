package org.example.controller;

import org.example.DBAccess.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class SpringController {


    private static final DAOInterface<UserDTO> daoInterface;
    static {
        daoInterface = new DAOImplementationHibernate();
    }

    @GetMapping("/AllUsers")
    public String allUsers(Model model) {

        List<UserDTO> list = daoInterface.getAllUsers();

        StringBuilder allUsers = new StringBuilder();
        for (UserDTO user : list){
            allUsers.append(user.toString()).append("<br />");
        }

        model.addAttribute("allUsers", allUsers.toString());
        return "allUsers";

    }

    @GetMapping("/UserByIdGet")
    public String userById() {
        return "UserById";
    }

    @GetMapping("/UserById")
    public String userByIdGet(Model model, @RequestParam(required = false) int Id) {


        String userById = "";

        try {
            UserDTO user = daoInterface.getUserById(Id);
            userById = user.toString();
        } catch (FieldNotFoundInDataBase fieldNotFoundInDataBase) {
            userById = fieldNotFoundInDataBase.getMessage().toString();
        } catch (NumberFormatException e){
            userById = "Invalid format type.";
        }

        model.addAttribute("userById",userById);
        return "userByIdShow";
    }


    @GetMapping("/JSP")
    public String jsp(Model model) {


        int accountSum = daoInterface.getAccountSum();
        UserDTO richestUser = null;

        try {
            richestUser = daoInterface.getRichestUser();
        } catch (FieldNotFoundInDataBase fieldNotFoundInDataBase) {
            fieldNotFoundInDataBase.printStackTrace();
        }

        model.addAttribute("richestUser",richestUser);
        model.addAttribute("accountSum",accountSum);
        return "servlet";
    }


}

package org.example.controller;


import org.example.DBAccess.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class SpringController {

    @GetMapping("/AllUsers")
    public String allUsers(Model model) {

        DAOInterface db = new DAOImplementationJDBC();
        List<UserDTO> list = db.getAllUsers();

        String allUsers = "";
        for (UserDTO user : list){
            allUsers += user.toString() + "<br />";
        }

        model.addAttribute("allUsers",allUsers);
        return "allUsers";

    }

    @GetMapping("/UserById")
    public String userByIdGet() {
        return "UserById";
    }

    @PostMapping("/UserById")
    public String userByIdPost(Model model, @RequestParam(required = false) int Id) {

        DAOInterface<UserDTO> db = new DAOImplementationJDBC();

        String userById = "";

        try {
            UserDTO user = db.getUserById( Id);
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

        DAOInterface<UserDTO> db = new DAOImplementationJDBC();
        int accountSum = db.getAccountSum();
        UserDTO richestUser = null;

        try {
            richestUser = db.getRichestUser();
        } catch (FieldNotFoundInDataBase fieldNotFoundInDataBase) {
            fieldNotFoundInDataBase.printStackTrace();
        }

        model.addAttribute("richestUser",richestUser);
        model.addAttribute("accountSum",accountSum);
        return "servlet";
    }


}

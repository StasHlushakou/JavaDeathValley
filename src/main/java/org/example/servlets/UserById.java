package org.example.servlets;

import org.example.DBAccess.DAOImplementationHibernate;
import org.example.DBAccess.DAOInterface;
import org.example.DBAccess.FieldNotFoundInDataBase;
import org.example.DBAccess.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/*
public class UserById extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DAOInterface<UserDTO> db = new DAOImplementationHibernate();

        String result = "";

        try {
            UserDTO user = db.getUserById( Integer.parseInt(request.getParameter("Id")));
            result = user.toString();
        } catch (FieldNotFoundInDataBase fieldNotFoundInDataBase) {
            result = fieldNotFoundInDataBase.getMessage().toString();
        } catch (NumberFormatException e){
            result = "Invalid format type.";
        }


        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String docType = "<!DOCTYPE html>";
        writer.println("<html>" +
                "<head><title>" + result + "</title></head>\n" +
                "<body>" + result +
                "</body>" +
                "</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}

 */

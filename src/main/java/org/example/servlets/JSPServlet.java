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
/*
public class JSPServlet  extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DAOInterface<UserDTO> db = new DAOImplementationHibernate();
        int sum = db.getAccountSum();
        UserDTO richestUser = null;

        try {
            richestUser = db.getRichestUser();
        } catch (FieldNotFoundInDataBase fieldNotFoundInDataBase) {
            fieldNotFoundInDataBase.printStackTrace();
        }

        request.setAttribute("richestUser", richestUser);
        request.setAttribute("accountSum", sum);

        getServletContext().getRequestDispatcher("/servlet.jsp").forward(request, response);
    }
}

 */

package servlets;

import DBAccess.DAOImplementation;
import DBAccess.DAOInterface;
import DBAccess.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AllUsers extends HttpServlet {

    private DAOInterface db;

    public void init() throws ServletException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DAOInterface db = new DAOImplementation();
        List<UserDTO> list = db.getAllUsers();

        String allUsers = "";
        for (UserDTO user : list){
            allUsers += user.toString() + "<br />";
        }

        response.setContentType("text/html");
        PrintWriter messageWriter = response.getWriter();

        messageWriter.println("<html>" +
                "<head></head>\n" +
                "<body>" + allUsers +
                "</body>" +
                "</html>");

    }

    public void destroy() {

    }


}

package servlet;

import ejb.ManagerEJBRemote;
import dto.UserDTO;
import dto.ContentDTO;

import java.io.IOException;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class UserAddMovie
 */



@WebServlet ("/addContent")
public class ManagerAddContent extends HttpServlet {

    @EJB
    private ManagerEJBRemote managerejb;

    public ManagerAddContent() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String title = (String) request.getParameter("title");
        String director = (String) request.getParameter("director");
        int year = Integer.parseInt(request.getParameter("year"));
        String category = (String) request.getParameter("category");

        ContentDTO contentDto = new ContentDTO(title, director, year, category);
        managerejb.addContent(contentDto);
    }
}

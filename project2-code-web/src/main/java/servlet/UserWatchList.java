package servlet;

import ejb.UserEJBRemote;
import dto.UserDTO;
import dto.ContentDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class UserAddMovie
 */


@WebServlet ("/watchList")
public class UserWatchList extends HttpServlet {

    @EJB
    private UserEJBRemote userejb;

    public UserWatchList() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String title = (String) request.getParameter("title");
        String director = (String) request.getParameter("director");
        int year = Integer.parseInt(request.getParameter("year"));
        String category = (String) request.getParameter("category");
        

        UserDTO userDto = null;
        ContentDTO contentDto = new ContentDTO(title, director, year, category);
        userejb.addMovie(contentDto, userDto);

    }
}

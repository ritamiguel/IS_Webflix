package servlet;

import data.User;
import dto.EpisodeDTO;
import ejb.UserEJBRemote;
import dto.UserDTO;
import dto.ContentDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class UserAddMovie
 */



@WebServlet ("/addMovie")
public class UserAddMovie extends HttpServlet {

    @EJB
    private UserEJBRemote userejb;

    public UserAddMovie() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String title = (String) request.getParameter("title");

        User iamuser = (User)session.getAttribute("user");
        long id = iamuser.getId();

        String result = userejb.addMovie(title, id);

        if(result.equals("Success")){
            response.sendRedirect(request.getContextPath()+"/userMenu.jsp");
            session.setAttribute("error", result);
        }
        else{
            response.sendRedirect(request.getContextPath()+"/addMovie.jsp");
            session.setAttribute("error", result);
        }
    }





}

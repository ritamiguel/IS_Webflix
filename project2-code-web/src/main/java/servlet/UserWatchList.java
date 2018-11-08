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
        UserDTO user = new UserDTO();

        session.setAttribute("myWatchList", user.getWatchlist());
        response.sendRedirect(request.getContextPath() + "/userWatchList.jsp");
    }
}

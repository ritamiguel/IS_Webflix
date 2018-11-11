package servlet;

import data.Content;
import data.User;
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


@WebServlet ("/watchList")
public class UserWatchList extends HttpServlet {

    @EJB
    private UserEJBRemote userejb;

    public UserWatchList() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        long id = (long) session.getAttribute("id");

        List <Content> u = userejb.watchList(id);

        session.setAttribute("myWatchList", u);
        response.sendRedirect(request.getContextPath() + "/userWatchList.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

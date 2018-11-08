package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import ejb.UserEJBRemote;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/edituser")
public class EditUser extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    private UserEJBRemote authEJB;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String newAttribute = request.getParameter("newAttribute");
        String option = (String) request.getParameter("option");
        long id = (long) session.getAttribute("id");
        String result = authEJB.updateUser(option, newAttribute, id);

        if(result.equals("Success"))
            response.sendRedirect(request.getContextPath() + "/home.jsp");
    }

}
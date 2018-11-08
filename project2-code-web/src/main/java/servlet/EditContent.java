package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import ejb.ManagerEJBRemote;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/editContent")
public class EditContent extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    private ManagerEJBRemote managerejb;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditContent() {
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
        String title = (String) request.getParameter("title");

        String result = managerejb.updateContent(option, newAttribute, title);

        if(result.equals("Success"))
            response.sendRedirect(request.getContextPath() + "/home.jsp");
    }

}
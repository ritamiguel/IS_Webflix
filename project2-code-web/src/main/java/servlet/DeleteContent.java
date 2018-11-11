package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dto.ContentDTO;
import ejb.ManagerEJBRemote;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/deleteContent")
public class DeleteContent extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    private ManagerEJBRemote managerejb;

    private ContentDTO contentdto;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteContent() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String title = request.getParameter("content");
        String respond = managerejb.deleteContent(title);

        if(respond.equals("Success"))
        	response.sendRedirect(request.getContextPath() + "/managerMenu.jsp");
        else {
        	session.setAttribute("error", "Could not find movie/serie");
        	response.sendRedirect(request.getContextPath() + "/deleteContent.jsp");
        }
    }

}
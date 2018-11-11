package servlet;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


import dto.*;
import data.*;
import ejb.*;

/**
 * Servlet implementation class DeleteAccount
 */
@WebServlet("/deleteAccount")
public class DeleteAccount extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    @EJB
	private UserEJBRemote authEJB;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
        long id = (long) session.getAttribute("id");
        String respond = authEJB.deleteAccount(id);

        if(respond.equals("Success")) {
        	response.sendRedirect(request.getContextPath() + "/home.jsp");
        	session.removeAttribute("user");
            session.setAttribute("isUserLoggedIn", false);
        }
        else {
        	session.setAttribute("error", "Could not find movie/serie");
        	response.sendRedirect(request.getContextPath() + "/deleteContent.jsp");
        }
	}

}

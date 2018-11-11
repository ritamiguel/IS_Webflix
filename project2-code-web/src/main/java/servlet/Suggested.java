package servlet;

import java.io.IOException;
import ejb.ManagerEJBRemote;
import dto.*;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.List;
/**
 * Servlet implementation class Suggested
 */
@WebServlet("/suggested")
public class Suggested extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
 
    @EJB
    private ManagerEJBRemote managerejb;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List <ContentDTO> yo = managerejb.getAllContent();
    	session.setAttribute("contents", yo);
        response.sendRedirect(request.getContextPath() +"/userMenu.jsp");
	}


}

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
 * Servlet implementation class showContents
 */
@WebServlet("/contents")
public class searchContents extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    @EJB
    private ManagerEJBRemote managerejb;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		
        String title = request.getParameter("title");
        String director = request.getParameter("director");
        String year = request.getParameter("year");
        String category = request.getParameter("category");
        
        String str_option = (request.getParameter("option"));
        int option = 0;
        if (str_option != null) {
            option = Integer.parseInt(str_option);
        }
        
        if(option == 1) {
        	List <ContentDTO> yo = managerejb.searchByTitle(title);
        	session.setAttribute("contents", yo);
            response.sendRedirect(request.getContextPath() +"/contents.jsp");
        }
        
        if(option == 2) {
        	List <ContentDTO> yo = managerejb.searchByDirector(director);
        	session.setAttribute("contents", yo);
            response.sendRedirect(request.getContextPath() +"/contents.jsp");
        }
        
        if(option == 3) {
        	List <ContentDTO> yo = managerejb.searchByYear(year);
        	session.setAttribute("contents", yo);
            response.sendRedirect(request.getContextPath() +"/contents.jsp");
        }
        
        if(option == 4) {
        	List <ContentDTO> yo = managerejb.searchByCategory(category);
        	session.setAttribute("contents", yo);
            response.sendRedirect(request.getContextPath() +"/contents.jsp");
        }
        
	}

	

}

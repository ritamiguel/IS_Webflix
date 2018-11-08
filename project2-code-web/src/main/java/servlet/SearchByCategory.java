package servlet;

import dto.ContentDTO;
import ejb.UserEJBRemote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveAccount
 */
@WebServlet("/searchContent")
public class SearchByCategory extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserEJBRemote userejb;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByCategory() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String cat = request.getParameter("category");
        ContentDTO contentdto = (ContentDTO) userejb.searchByCategory(cat);
        request.getSession().setAttribute("content", contentdto);

        request.getRequestDispatcher("searchAllContent.jsp").forward(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
package servlet;

import ejb.ManagerEJBRemote;
import dto.EpisodeDTO;
import dto.ContentDTO;
import javax.ejb.EJB;

import java.io.IOException;
import java.util.Date;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class UserAddMovie
 */



@WebServlet ("/addContent")
public class ManagerAddContent extends HttpServlet {

    @EJB
    private ManagerEJBRemote managerejb;

    public ManagerAddContent() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String title = (String) request.getParameter("title");
        String director = (String) request.getParameter("director");
        int year = Integer.parseInt(request.getParameter("year"));
        String category = (String) request.getParameter("category");
        int option = Integer.parseInt(request.getParameter("option"));

        ContentDTO contentDto = null;
        if(option == 1)
            contentDto = new ContentDTO(title, director, year, category, null);
        else {
            List<EpisodeDTO> episodes = new ArrayList<EpisodeDTO>();
            episodes.add(new EpisodeDTO(0, "exmaple"));
            contentDto = new ContentDTO(title, director, year, category, episodes);

        }
        String result = managerejb.addContent(contentDto, option);
        if(result.equals("Success")){
            response.sendRedirect(request.getContextPath()+"/managerMenu.jsp");
            session.setAttribute("error", result);
        }
        else{
            response.sendRedirect(request.getContextPath()+"/managerAddContent.jsp");
            session.setAttribute("error", result);
            System.out.println("Error creating new content");
        }
    }
}

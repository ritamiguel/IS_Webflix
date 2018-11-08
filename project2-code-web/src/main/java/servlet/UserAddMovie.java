package servlet;

import dto.EpisodeDTO;
import ejb.UserEJBRemote;
import dto.UserDTO;
import dto.ContentDTO;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class UserAddMovie
 */



@WebServlet ("/addMovie")
public class UserAddMovie extends HttpServlet {

    @EJB
    private UserEJBRemote userejb;

    public UserAddMovie() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        request.getSession().removeAttribute("log");
        if(request.getSession().getAttribute("user")==null) {
            if (action.compareToIgnoreCase("newMovie") == 0) {
                request.getRequestDispatcher("addMovie.jsp").forward(request, response);
            } else{
                request.getRequestDispatcher("userMenu.jsp").forward(request,response);
            }
        }
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
            List<EpisodeDTO> episodes = null;
            episodes.add(new EpisodeDTO(0, "exmaple"));
            contentDto = new ContentDTO(title, director, year, category, episodes);

        }
        UserDTO userDto = new UserDTO();
        userejb.addMovie(contentDto, userDto);
    }





}

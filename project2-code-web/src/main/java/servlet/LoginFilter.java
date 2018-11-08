package servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest req	, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession(false);
        String loginService = request.getContextPath() + "/login";
        String registerService = request.getContextPath() + "/register";
        String loginURI = request.getContextPath() + "/login.jsp";
        String registerURI = request.getContextPath() + "/home.jsp";

        boolean loggedIn = session != null && session.getAttribute("id") != null;
        boolean loginRequest = request.getRequestURI().equals(loginURI);
        boolean registerRequest  = request.getRequestURI().equals(registerURI);
        boolean loginTry = request.getRequestURI().equals(loginService);
        boolean registerTry = request.getRequestURI().equals(registerService);

        if (loggedIn || loginRequest || registerRequest || loginTry || registerTry) {
            chain.doFilter(request, response);
        } else {
            response.sendRedirect(loginURI);
        }
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }


}
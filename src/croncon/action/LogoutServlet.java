package croncon.action;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import croncon.db.Dbconnection;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		 public void doGet(HttpServletRequest request, HttpServletResponse response)
	             throws ServletException, java.io.IOException {
			 try
			   {     
			         HttpSession session=request.getSession(false);
			         session.removeAttribute("currentsessionuser");
			         session.invalidate();
			         response.sendRedirect("../index.jsp");
			   }      
			   catch (Throwable theException)       
			   {
			        System.out.println(theException);
			   }
		 }
	   
	}

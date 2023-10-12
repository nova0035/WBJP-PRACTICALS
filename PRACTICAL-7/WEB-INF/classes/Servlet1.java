import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet1 extends HttpServlet{

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	
		HttpSession s = request.getSession();
		s.setAttribute("name","bhavya");
		s.setAttribute("age","18");

		Cookie ck1 = new Cookie("department","computer");
		ck1.setMaxAge(60*60);

		Cookie ck2 = new Cookie("sem","5");
		ck2.setMaxAge(60*60);

		response.addCookie(ck1);	
		response.addCookie(ck2);

	}
}

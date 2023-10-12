import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet2 extends HttpServlet{

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		HttpSession s = request.getSession(false);
		String name = (String) s.getAttribute("name");
		String age = (String) s.getAttribute("age");

		Cookie c[] = request.getCookies();


		out.println("Name = " + name + "<br>Age = " + age + "<br>");

		for(Cookie ck : c){
			out.println(ck.getName() + " " + ck.getValue() + "<br>");
		}

	}
}

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{

		response.setContentType("text/html"); 
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Servlet2</h1></body></html>");
	}
}

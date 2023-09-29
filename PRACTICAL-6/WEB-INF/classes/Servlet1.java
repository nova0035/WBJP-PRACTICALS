import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		RequestDispatcher rd = request.getRequestDispatcher("/Servlet2");
		rd.forward(request, response);
	}
}

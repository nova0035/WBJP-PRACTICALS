import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ReadParameter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String name = request.getParameter("name");
            String password = request.getParameter("password");

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.print("<html><body><h1>Name = " + name + "</h1><br><h1>Password = " + password + "</h1></body></html>");
        } catch (IOException ieo) {
            
            ieo.printStackTrace(); 
        }
    }
}

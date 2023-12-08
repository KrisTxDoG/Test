package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Krist_09_response
 */
@WebServlet("/Krist_09_response")
public class Krist_09_response extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
				
		Object xx = (String)request.getAttribute("x");
		
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.print("I'm Krist(09)");
		
		if(name != null) {
			outPrintWriter.print("Hello" + name);
			outPrintWriter.printf("%s" , xx);
		}
	}
}

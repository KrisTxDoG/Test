package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bike.Bike;

/**
 * Servlet implementation class Krist_10_include_v1
 */
@WebServlet("/Krist_10_include_v1")
public class Krist_10_include_v1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		
		Bike b1 =  (Bike) request.getAttribute(("bike"));
		out.print("I'm Krist 10" + b1.getSpeed());
		
		out.print("I'm Krist 10 v1");
		
	}


}

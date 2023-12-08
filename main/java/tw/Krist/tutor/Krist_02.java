package tw.Krist.tutor;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Krist_02
 */
@WebServlet("/Krist_02")
public class Krist_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 尋訪
		Enumeration<String> names = request.getHeaderNames();
		
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = request.getHeader(name);
			
			System.out.printf("%s : %s\n",name, value);
		}
		System.out.println("--------------------");
		
	}
	
	

}

package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.webresources.EmptyResource;

/**
 * Servlet implementation class Krist_04_doGet
 */
@WebServlet("/Krist_04_doGet")
public class Krist_04_doGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 網路傳播都是字串
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		
		
//		System.out.printf("%s : %s", x, y);
		
	
		
		// 處理畫面透過 response
		// setContentTyep 和瀏覽器說以下內容是什麼
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
	
		
		try {
			int r = Integer.parseInt(x) + Integer.parseInt(y);
			out.printf("%s + %s = %d", x, y, r);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("XXXXXXXXX");
		}
	}

}

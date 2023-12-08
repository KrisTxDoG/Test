package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Krist_08_request
 */
@WebServlet("/Krist_08_request")
public class Krist_08_request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 設定語系
		// 這邊都是由這兩個遇見實體去進行行為
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher =  request.getRequestDispatcher("Krist_09_response");
		
		// 設定請求的屬性，任何物件都可以帶進來
		request.setAttribute("x", "100");
		request.setAttribute("y", "3");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter outPrintWriter = response.getWriter();
		
		outPrintWriter.print("<h1>Krist Big Company<h1>");
		outPrintWriter.print("<hr/>");
		outPrintWriter.print("Hello Wrold");
		
		dispatcher.include(request, response);
		
		outPrintWriter.flush();
		
		// 也可以使用 response.flushBuffer
	}

}

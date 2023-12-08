package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bike.Bike;

/**
 * Servlet implementation class Krist_10_include
 */
@WebServlet("/Krist_10_include")
public class Krist_10_include extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 透過 dispatcher 可以傳送到其他檔案
		RequestDispatcher dispatcher = request.getRequestDispatcher("Krist_10_include_v1");
	
		// 設定 response
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("I am Krist10-1 <hr/>");
		
		Bike b1 = new Bike();
		b1.upSpeed(); b1.upSpeed(); b1.upSpeed();
		System.out.println(b1.getSpeed());
		
		// 丟物件比字串更為方便
		request.setAttribute("bike", b1);
		
		// 使用 include 產生 10-v1檔案
		// v0 提供營業 v1 提供介面
		dispatcher.include(request, response);
		out.print("I am Krsit10 <hr/>");
	}

}

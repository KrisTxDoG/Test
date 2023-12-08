package tw.Krist.tutor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bike.KristUtils;

/**
 * Servlet implementation class Krist_11_MVC
 */
@WebServlet("/Krist_11_MVC")
public class Krist_11_MVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 接收參數 Control，沒有也沒關係，會拋出例外
		String x = request.getParameter("x");
		String y = request.getParameter("y");

		// 計算 Module
		try {
			KristUtils cale = new KristUtils(x, y);
			request.setAttribute("myCalc", cale);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			System.out.println(e);

		}
		// 呈現 View
		request.setAttribute("view", "view1");
		RequestDispatcher dispatcher = request.getRequestDispatcher("Krist_11_view");
		dispatcher.forward(request, response);

	}

}

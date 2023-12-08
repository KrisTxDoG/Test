package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bike.KristLoadin;
import Bike.KristUtils;

/**
 * Servlet implementation class Krist_11_view
 */
@WebServlet("/Krist_11_view")
public class Krist_11_view extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String web = "";
		// 呈現畫面 request
		try {
			KristUtils myCalc = (KristUtils) request.getAttribute("myCalc");
			String view = (String) request.getAttribute("view");
			web = KristLoadin.loadView(view);
			out.printf(web, myCalc.getX(), myCalc.getY(), myCalc.plus());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			System.out.println(e);
			out.printf(web, "", "", "");
		}
	}

}

package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.PasswdUserDatabase;

/**
 * Servlet implementation class Krist_05_memberAccount
 */
@WebServlet("/Krist_05_memberAccount")
public class Krist_05_memberAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Krist_05_memberAccount() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		
		String[] hobby =request.getParameterValues("hobby");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.append(account).append(":" + password + "<br/>");
		for(String h : hobby) {
			System.out.println(h);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

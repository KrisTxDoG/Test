package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Krist_01
 */
@WebServlet("/Krist_01")
public class Krist_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Krist_01() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter	pw = response.getWriter();
		
		// String buffer and builder 都有實作 charSequence
		// append return 回來是自己可以再接append
		pw.append("Krist").append("OK").append("我不喜歡用 edge");
	}

}

package tw.Krist.tutor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Krist_15_SQL
 */
@WebServlet("/Krist_15_SQL")
public class Krist_15_SQL extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection conn;
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1:8889/Krist";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Krist_15_SQL() {
    	try {
    		 	Properties prop = new Properties();
    	        prop.put("user", USER);
    	        prop.put("password", PASSWD);
    	        
    	    
    	        
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write("<table border='1' width = '100%'>");
	
		
		out.write("</table>");
	}



}

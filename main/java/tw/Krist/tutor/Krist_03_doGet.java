package tw.Krist.tutor;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Krist_03_doGet
 */
@WebServlet("/Krist_03_doGet")
public class Krist_03_doGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 物件會一直存在，一直到 service 掛掉為止
	public Krist_03_doGet() {
		System.out.println("Krist_03()");
	}
	
	
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service");
		
		// 重要，執行 doGET 的方法
		super.service(req, resp);
	}



	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init");
		
		super.init(config);
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 哪些參數被傳遞過來，透過問號 ? 來傳遞參數
		// 網路傳遞的東西都是字串
		Enumeration<String> paramsEnumeration = request.getParameterNames();
		while (paramsEnumeration.hasMoreElements()) {
			String param = paramsEnumeration.nextElement();
			String value = request.getParameter(param);
			System.out.printf("%s : %s\n",param , value);
		}
		
	}

}

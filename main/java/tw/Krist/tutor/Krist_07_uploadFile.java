package tw.Krist.tutor;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Krist_07_uploadFile
 */

@WebServlet("/Krist_07_uploadFile")
@MultipartConfig(
		location = "/Users/caiyancheng/eclipse-workspace/web/upload"
		)

public class Krist_07_uploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Collection 可以 Foreach 儲存不同的檔案類型
		Collection<Part> parts = request.getParts();
		
		for (Part part :parts) {
			System.out.println(part.getName());
			String type = part.getContentType();
			
			if(type != null && part.getSize() >= 0 ) {
				part.write(part.getSubmittedFileName());
			}
			
		}
	}

}

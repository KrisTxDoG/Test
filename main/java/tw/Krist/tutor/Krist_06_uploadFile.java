package tw.Krist.tutor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Krist_06_uploadFile
 */
@WebServlet("/Krist_06_uploadFile")

// 設定 Part 儲存的地方
@MultipartConfig(
		location = "/Users/caiyancheng/eclipse-workspace/web/upload"
		)
public class Krist_06_uploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Krist_06_uploadFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	
		// 取得 Part 的物件 擁有以下的資訊的物件實體
		Part part =  request.getPart("upload");
		
		System.out.println(part.getName());
		System.out.println(part.getSize());
		System.out.println(part.getSubmittedFileName());
		System.out.println(part.getContentType());
		
		
		
		// 如果資料尺寸大於 0 則將資料匯入進來
		if(part.getSize() > 0) {
			// 將資料匯進來
			part.write(part.getSubmittedFileName());
			
		
		}
	}

}

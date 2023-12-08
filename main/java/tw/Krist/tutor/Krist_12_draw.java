package tw.Krist.tutor;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Krist_12_draw
 */
@WebServlet("/Krist_12_draw")
public class Krist_12_draw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	// ----- 在後端繪圖 -----
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int w = 400, h = 24;
		double rate = 0;
		try {
			rate = Double.parseDouble(request.getParameter("rate"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 設定影像格式為 image / jpeg，可以使呈現的畫面設定為影像檔案
		response.setContentType("image/jpeg");
		
		// 繪圖
		BufferedImage img = new BufferedImage(400, 24, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = img.createGraphics();
		
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(0, 0, w, h);
		g2d.setColor(Color.RED);
		g2d.fillRect(0, 0, (int)(w*rate/100), h);
		
		// 輸出到瀏覽器 response 瀏覽器資料 request
		OutputStream os =  response.getOutputStream();
		
		// 拿到串流實際進行 IO 動作
		ImageIO.write(img, "jpeg", os);
		
		response.flushBuffer();
		
		
	}


}

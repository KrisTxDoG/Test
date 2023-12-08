package tw.Krist.tutor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.ImageGraphicAttribute;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class Krist_14_image
 */
@WebServlet("/Krist_14_image")
public class Krist_14_image extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	BufferedImage img =	ImageIO.read(new File("/Users/caiyancheng/eclipse-workspace/web/upload/ball_1.jpeg"));
	Graphics2D g2d = img.createGraphics();
	
	// 變形演算法
	Font font = new Font(null, Font.BOLD, 72);
	AffineTransform tran = new AffineTransform();
	tran.rotate(Math.toRadians(100));
	Font font2 = font.deriveFont(tran);
	
	
	g2d.setColor(Color.yellow);
	g2d.setFont(font2);
	g2d.drawString("資展國際", 100, 100);
	
		
	response.setContentType("image/jpeg");
	
	// os 就是瀏覽器的部分
	OutputStream os = response.getOutputStream();
	ImageIO.write(img, "jpeg", os);
	
	// 將資料再度存到資料夾
	ImageIO.write(img, "jpeg", new File("/Users/caiyancheng/eclipse-workspace/web/upload/ball_888.jpeg"));
	}



}

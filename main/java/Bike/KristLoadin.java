package Bike;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.security.PublicKey;

public class KristLoadin {
	public static String loadView(String view) throws Exception {
		String viewFoldString = "/Users/caiyancheng/eclipse-workspace/web/src/main/webapp/views";
		File viewFildString = new File(viewFoldString + view + ".html");
		// 讀檔
		BufferedReader bufferedReader = new BufferedReader(new FileReader(viewFildString));
		String line;
		StringBuffer sb = new StringBuffer();
		while ((line = bufferedReader.readLine()) != null) {
			sb.append(line);
		}

		bufferedReader.close();
		return sb.toString();
	}
}

package Bike;

public class KristUtils {
	private int x; int y;
	
	public KristUtils(String x, String y) throws Exception{
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	
	public int plus() {
		return x + y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
}

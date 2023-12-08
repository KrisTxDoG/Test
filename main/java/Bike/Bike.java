package Bike;

// 若沒有 extends 父類別就是 Object
public class Bike extends Object {
	protected double speed;
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.4;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 :speed * 0.5;
	}
	public double getSpeed() {
		return speed;
	}
}

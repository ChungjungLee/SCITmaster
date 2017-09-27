
public class Circle {
	private int r;
	private int cx;
	private int cy;
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public int getX() {
		return cx;
	}
	
	public void setX(int x) {
		this.cx = x;
	}
	
	public int getY() {
		return cy;
	}
	
	public void setY(int y) {
		this.cy = y;
	}
	
	public double getArea() {
		return r * r * 3.14;
	}
	
}

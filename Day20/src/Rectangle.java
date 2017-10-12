
public class Rectangle extends Shape {
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public int circumference() {
		return (getWidth() + getHeight()) * 2;
	}
	
	@Override
	public int area() {
		return getWidth() * getHeight();
	}
	
	public void print() {
		System.out.println("가로: " + getWidth() 
							+ ", 세로: " + getHeight()
							+ ", 둘레: " + circumference()
							+ ", 면적: " + area());
	}
}

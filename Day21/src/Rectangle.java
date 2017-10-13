
public class Rectangle extends Shape {
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double getPerimeter() {
		return (getWidth() + getHeight()) * 2;
	}
	
	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}
}

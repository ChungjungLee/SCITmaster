
public class Triangle extends Shape {

	public Triangle() {
		
	}
	
	public Triangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double getPerimeter() {
		double side = Math.sqrt(Math.pow(getWidth(), 2) +
								Math.pow(getHeight(), 2));
		return side + getWidth() + getHeight();
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight() / 2;
	}

}

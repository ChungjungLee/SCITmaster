
public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * 면적을 구한다.
	 * @return 원의 면적
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/*
	 * Getters and Setters
	 */
	public double getRadius() {
		return radius;
	}
	
}

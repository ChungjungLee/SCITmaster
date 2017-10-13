
public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * ������ ���Ѵ�.
	 * @return ���� ����
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

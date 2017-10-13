
public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius) {
		super(radius);
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}
	
	/*
	 * Getters and setters
	 */
	public double getHeight() {
		return height;
	}
	
}


public class Circle implements Drawable {

	private double radius;
	
	@Override
	public void draw() {
		System.out.println("원을 그리고 있다");
	}
 
	public double calArea() {
		return radius * radius * 3.14;
	}
}

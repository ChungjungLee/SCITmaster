
public class Circle implements Drawable {

	private double radius;
	
	@Override
	public void draw() {
		System.out.println("���� �׸��� �ִ�");
	}
 
	public double calArea() {
		return radius * radius * 3.14;
	}
}

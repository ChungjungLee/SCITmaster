
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
		System.out.println("����: " + getWidth() 
							+ ", ����: " + getHeight()
							+ ", �ѷ�: " + circumference()
							+ ", ����: " + area());
	}
}

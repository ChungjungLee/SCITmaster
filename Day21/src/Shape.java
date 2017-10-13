
public abstract class Shape {
	/*
	 * 추상 클래스라고 하여도
	 * 필드, 일반 메소드, 생성자를 모두 가질 수 있다.
	 */
	private double width;
	private double height;
	
	/*
	 * 생성자를 만들수는 있는데 
	 * 다른 클래스에서 new Shape()으로 객체 생성은
	 * 안 된다는게 포인트
	 * 
	 * 단지 이 추상클래스를 상속받는 클래스에서 super()를
	 * 사용하기 위함이다
	 */
	public Shape() {
		
	}
	
	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/*
	 * abstract methods
	 */
	public abstract double getPerimeter();
	public abstract double getArea();
	
	/*
	 * Getters and setters
	 */
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}


public class Shape {
	private int width;
	private int height;
	
	public Shape() {
		
	}
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int circumference() {
		// 문제는 형태가 정해져 있지 않은 도형이기 때문에 
		// 둘레와 면적을 구할 수 없다. 그래서 우선은 0을 반환
		return 0; 
	}
	
	public int area() {
		return 0;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}

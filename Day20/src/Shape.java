
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
		// ������ ���°� ������ ���� ���� �����̱� ������ 
		// �ѷ��� ������ ���� �� ����. �׷��� �켱�� 0�� ��ȯ
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

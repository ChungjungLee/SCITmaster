
public abstract class Shape {
	/*
	 * �߻� Ŭ������� �Ͽ���
	 * �ʵ�, �Ϲ� �޼ҵ�, �����ڸ� ��� ���� �� �ִ�.
	 */
	private double width;
	private double height;
	
	/*
	 * �����ڸ� ������� �ִµ� 
	 * �ٸ� Ŭ�������� new Shape()���� ��ü ������
	 * �� �ȴٴ°� ����Ʈ
	 * 
	 * ���� �� �߻�Ŭ������ ��ӹ޴� Ŭ�������� super()��
	 * ����ϱ� �����̴�
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

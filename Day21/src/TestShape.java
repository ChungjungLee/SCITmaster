
public class TestShape {
	public static void main(String[] args) {
		// Cannot instantitate the type Shape
		//Shape s1 = new Shape();
		
		Rectangle rec = new Rectangle(4, 4);
		System.out.printf("�ѷ�: %f, ����: %f\n", 
							rec.getPerimeter(), rec.getArea());
		
		Triangle tri = new Triangle(4, 3);
		System.out.printf("�ѷ�: %f, ����: %f\n", 
							tri.getPerimeter(), tri.getArea());
	}
}

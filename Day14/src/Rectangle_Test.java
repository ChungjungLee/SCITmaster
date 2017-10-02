
public class Rectangle_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		
		rec.h = 10;
		rec.w = 20;
		
		System.out.println("전체 넓이: " + rec.area());
		System.out.println("전체 길이: " + rec.perimeter());
	}

}

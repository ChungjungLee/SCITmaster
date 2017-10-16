
public class TestDrawable {

	public static void main(String[] args) {
		/*
		 * 우리가 지금까지 사용했던 배열은 모두 공통된 타입인 원소들일 경우만 사용했다
		 * 
		 * 그런데 같은 interface를 구현하고 있는 클래스들도 배열로 사용이 가능하다
		 */
		Circle[] cList = new Circle[3];
		Drawable[] dList = new Drawable[3];
		
		dList[0] = new Circle();
		/*
		 * Circle이 Drawable이 된다는 이야기. 형변환이 되었다.
		 */
		dList[1] = new Rectangle();
		dList[2] = new Triangle();
		
		for (Drawable d : dList) {
			/*
			 * 마찬가지로 형변환이 되었다
			 */
			/*
			 * 객체 instanceof 클래스명
			 * 객체가 클래스명 타입의 객체입니까를 묻는 연산자
			 * 
			 * 왜 이거를 사용하는가?
			 * 들어오는 데이터가 유효한지, 어떤 타입인지를 검사하기 위해,
			 * 상실된 기능(필드, 메소드)을 다시 복구시켜 사용하고 싶을 때
			 */
			if (d instanceof Circle) {
				System.out.println("원");
				//d.calArea();
				Circle circle = (Circle) d;
				circle.calArea();
				
			} else if (d instanceof Rectangle) {
				System.out.println("사각형");
				
			} else {
				System.out.println("삼각형");
				
			}
			d.draw();
		}
		
		/**
		 * 상향 형변환 Up-Casting		ex) Drawable d = new Circle();
		 * 자식으로부터 부모로 올라가는 형변환
		 * 자식이 가지고 있는 필드, 메소드 등은 없어지는 셈이 된다.
		 * 부모가 알고 있는 필드와 메소드만 사용이 가능하다
		 * 
		 * 하향 형변환 Down-Casting	ex) Circle c = (Drawable) d;
		 * 부모로부터 자식으로 내려가는 형변환
		 * 
		 * 쉽게 생각하면, 확장/구현된 클래스를 줄이는 것: 상향 형변환
		 * 확장/구현시킬 클래스를 확장/구현된 클래스로 늘이는 것: 하향 형변환
		 */
		Circle c = new Circle();
		c.calArea();
		Drawable d = (Drawable) c;
		// d.calArea();
		// Drawable 입장에서는 calArea()의 존재 자체를 몰라서 error
		
		/*
		 * UpCasting 된 변수는 다시 같은 타입으로 DownCasting해야지
		 * 다른 타입으로 DownCasting으로 하면 안 된다.
		 */
		Rectangle r = new Rectangle();
		d = (Drawable) r;
		Rectangle r1 = (Rectangle) d;
		//Circle c1 = (Circle) d;
		
		
	}

}


public class Rectangle {
	int w; //has-a 관계
	int h;
	
	int area() {
		int area = w * h;
		return area;
		//return 100; 하게 되면 언제나 100 반환
	}
	
	int perimeter() {
		int perimeter = (w+h)*2;
		return perimeter;
		//반환을 하게 되면 이 메소드를 호출한 곳에 
		//반환하게 된다
	}
	
}

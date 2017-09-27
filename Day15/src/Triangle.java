
public class Triangle {
	//필드들은 초기화를 해주지 않아도 알아서 자동 초기화가 된다.
	//int는 0으로
	int width;
	int height;
	
	double area() {
		double result;
		result = width * height * 0.5;
		
		return result;
	}
}

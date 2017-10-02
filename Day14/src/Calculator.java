
public class Calculator {
	
	int kor;	//국어 점수
	int mat;	//수학 점수
	int eng;	//영어 점수
	
	// 총점 계산해서 반환하는 메소드
	// 반환형 int는 return 옆에 오는 반환 값의 타입을 알림
	int getSum() {
		// 반환을 하겠다는 것
		int sum = kor + eng + mat;
		return sum;	//결과값 내보낸다
		// 이 메소드를 호출한 곳에 위의 sum값을 전달
	}
	
	//
	double getAverage() {
		double avg = (kor + mat + eng) / 3.0;
		return avg;
	}
}

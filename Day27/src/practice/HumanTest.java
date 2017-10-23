package practice;

/*
 * 프로그램을 짤 때 클래스 간의 의존도가 낮은게 좋다!
 * 그래서 다음과 같이 main을 쪼개보려고 한다.
 * 
 * (main):ui를 호출할 시작점 -> (UI):ui출력만 <-> (Manager):메인 기능과 리스트(정보)를 가지고 있다, 데이터를 다루기만 함
 * 
 * main에서 UI를 실행시키기 위해서는 반드시 객체를 만든 후 사용 가능
 * 
 */
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UI().start();	// 생성자에 parameter를 넘기지 않는게 좋은 방법
	}

}

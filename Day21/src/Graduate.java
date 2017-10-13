
public class Graduate extends Student {
	// 조교 유형, 장학금 비율
	private String ta;
	private double scholarship;
	
	public Graduate(String name, int id, String major) {
		super(name, id, major);
		this.ta = "미정";
		this.scholarship = 0.0;
	}
	
	/*
	 * 조교 타입을 나타내는 상수
	 * 문자열을 가지고 비교하다 보면 일본어 자판의 경우에는
	 * 쉽게 다른 결과가 나올 수 있으므로 정수형 사용하는게 좋다.
	 * 
	 * 모든 객체가 가지고 있을 필요 없기 때문에 static으로 선언
	 * 이 클래스를 사용하는 클래스에서도 타입을 사용하는게 훨씬 쉽고
	 * 가독성도 좋다
	 */
	public static final int TEACHING_ASSIST = 1,
							RESEARCH_ASSIST = 2;
	
	public Graduate(String name, int id, 
					String major, int year, 
					int credit, String ta, double scholarship) {
		super(name, id, major, year, credit);
		// TODO: parameter condition check
		if (ta.equals("교육 조교") || ta.equals("연구 조교")) {
			this.ta = ta;
		} else {
			this.ta = "미정";
		}
		
		/*
		 * 생성자에서 조건을 비교하여 아예 객체를 만들지 못하게는 하지 못한다.
		 * 그러므로 default 값들을 지정해서 객체를 만들어 반환토록 한다.
		 * 
		 * 생성자에서 setter를 호출해 setter 내에서 조건 비교&default값 설정을
		 * 하도록 시키면 훨씬 안전한 코드가 된다.
		 */
		setScholarship(scholarship);
	}
	
	public String toString() {
		return super.toString() + "\n"
				+ "조교 유형: " + ta + "\n"
				+ "장학금 비율: " + scholarship;
	}
	
	public String getTa() {
		return ta;
	}
	public void setTa(String ta) {
		this.ta = ta;
	}
	
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		if (scholarship < 0.0) {
			this.scholarship = 0.0;
		} else if (scholarship > 1.0) {
			this.scholarship = 1.0;
		} else {
			this.scholarship = scholarship;
		}
	}
	
}


public class Teacher extends Person{
	private String subject;

	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/**
	 * 메소드 오버라이딩
	 * 부모로부터 물려 받은 함수들 중 마음에 안 드는걸 자식 마음대로 바꾸는 것
	 * 함수를 덮어 쓰는것임!
	 * 
	 * 주의점.
	 * 오버라이딩 할 함수의 형태와 완전히 똑같은 함수를 사용해야 한다
	 * 
	 * @Override이라는 annotation이 필요
	 * 
	 */
}

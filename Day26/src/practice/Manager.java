package practice;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Human> list;
	// 왜 필드에서 변수를 초기화하지 않는가?
	// 일반적으로는 생성자를 통해서 초기화하기 때문
	
	/*
	 * Constructor
	 */
	public Manager() {
		list = new ArrayList<>();
	}
	
	// UI측에서 어떠한 기능을 수행해 달라고 요청하는 클래스이기 때문에
	// 기능들은 public으로 선언해줘야 한다.
	
	/**
	 * Human 객체를 저장한다.
	 * @param h
	 * @return
	 */
	public boolean insert(Human h) {
		boolean isAdded = list.add(h);
		// List는 등록여부를 알아서 반환
		// array는 등록여부를 직접 확인해야 함
		
		// TODO: 주민번호가 동일한 사람이 있다면 등록 불가
		
		return isAdded;
	}
	
	/**
	 * 주민번호 가지고 Human 객체를 검색한다.
	 * @param ssn
	 * @return
	 */
	public Human select(String ssn) {
		// Human result = null; 해서 result만 반환토록 해도 괜찮다
		for (int i = 0; i < list.size(); i++) {
			Human temp = list.get(i);
			
			if (ssn.equals(temp.getSsn())) {
				return temp;
			}
		}
		
		return null;
	}
}

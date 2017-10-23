package practice;

import java.util.ArrayList;

/*
 * 서버와 비슷
 */
public class Manager {
	private ArrayList<Human> list;
	// 우리가 만든 4가지 타입의 클래스 모두가 Human으로 변환이 가능
	// 왜 필드에서 변수를 초기화하지 않는가?
	// 일반적으로는 생성자를 통해서 초기화하기 때문
	
	/*
	 * Constructor
	 */
	public Manager() {
		list = new ArrayList<>();
	}
	
	/*
	 * Getter
	 */
	public ArrayList<Human> getList() {
		return this.list;
	}
	
	// UI측에서 어떠한 기능을 수행해 달라고 요청하는 클래스이기 때문에
	// 기능들은 public으로 선언해줘야 한다.
	
	/**
	 * Human 객체를 저장한다.
	 * @param h
	 * @return
	 */
	public boolean insert(Human h) {
		//boolean isAdded = list.add(h);
		// List는 등록여부를 알아서 반환
		// array는 등록여부를 직접 확인해야 함
		
		// TODO: 주민번호가 동일한 사람이 있다면 등록 불가
		/*
		if (select(h.getSsn()) == null) {
			// 동일한 사람이 없으므로 그냥 넣어주면 된다
			return list.add(h);
		} else {
			return false;
		}
		*/
		// 단순히 if문에 우리가 하고 싶은 문장을 쓰는 것보다는 
		// 배제시키고 싶은 조건들을 먼저 비교해서 return 시키는 것이 가독성 좋음
		if (select(h.getSsn()) != null) {
			return false;
		}
		
		return list.add(h);
		/*
		for (int i = 0; i < list.size(); i++) {
			Human temp = list.get(i);
			
			if (temp.getSsn().equals(h.getSsn())) {
				return false;
			}
		}
		*/
		
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
	
	/**
	 * 주민번호 가지고 특정 Human 객체를 삭제한다.
	 * @param ssn
	 * @return
	 */
	public boolean delete(String ssn) {
		// 지우려는 사람이 있는지 판별
		// select()의 반환값이 찾은 Human이거나 null
		
		/*
		Human temp = select(ssn);
		
		if (temp == null) {
			return false;
		} else {
			return list.remove(temp);
		}
		*/
		
		// ArrayList.remove()는 overloading 되어 있다.
		// object를 넘기는 것보다는 index를 넘기는게 훨씬 효율적으로 보인다.
		for (int i = 0; i < list.size(); i++) {
			Human temp = list.get(i);
			
			if (temp.getSsn().equals(ssn)) {
				list.remove(i);
				return true;
			}
		}
		
		return false;
		
	}
	
	/**
	 * 현재 저장된 List의 사이즈를 반환한다.
	 * @return
	 */
	public int getListSize() {
		return list.size();
	}
	
	/**
	 * 특정 index에 위치한 Human 객체를 반환한다.
	 * @param index
	 * @return
	 */
	public Human getHuman(int index) {
		return list.get(index);
	}
	
	/**
	 * 현재 저장된 List를 전부 출력한다.
	 */
	public void printAll() {
		if (list.size() == 0) {
			System.out.println("등록된 사람이 없습니다.");
		} else {
			for (int index = 0; index < list.size(); index++) {
				System.out.println((index + 1) + ") " + list.get(index));
			}
		}
	}
}

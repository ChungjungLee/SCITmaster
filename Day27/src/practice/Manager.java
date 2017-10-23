package practice;

import java.util.ArrayList;

/*
 * ������ ���
 */
public class Manager {
	private ArrayList<Human> list;
	// �츮�� ���� 4���� Ÿ���� Ŭ���� ��ΰ� Human���� ��ȯ�� ����
	// �� �ʵ忡�� ������ �ʱ�ȭ���� �ʴ°�?
	// �Ϲ������δ� �����ڸ� ���ؼ� �ʱ�ȭ�ϱ� ����
	
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
	
	// UI������ ��� ����� ������ �޶�� ��û�ϴ� Ŭ�����̱� ������
	// ��ɵ��� public���� ��������� �Ѵ�.
	
	/**
	 * Human ��ü�� �����Ѵ�.
	 * @param h
	 * @return
	 */
	public boolean insert(Human h) {
		//boolean isAdded = list.add(h);
		// List�� ��Ͽ��θ� �˾Ƽ� ��ȯ
		// array�� ��Ͽ��θ� ���� Ȯ���ؾ� ��
		
		// TODO: �ֹι�ȣ�� ������ ����� �ִٸ� ��� �Ұ�
		/*
		if (select(h.getSsn()) == null) {
			// ������ ����� �����Ƿ� �׳� �־��ָ� �ȴ�
			return list.add(h);
		} else {
			return false;
		}
		*/
		// �ܼ��� if���� �츮�� �ϰ� ���� ������ ���� �ͺ��ٴ� 
		// ������Ű�� ���� ���ǵ��� ���� ���ؼ� return ��Ű�� ���� ������ ����
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
	 * �ֹι�ȣ ������ Human ��ü�� �˻��Ѵ�.
	 * @param ssn
	 * @return
	 */
	public Human select(String ssn) {
		// Human result = null; �ؼ� result�� ��ȯ��� �ص� ������
		for (int i = 0; i < list.size(); i++) {
			Human temp = list.get(i);
			
			if (ssn.equals(temp.getSsn())) {
				return temp;
			}
		}
		
		return null;
	}
	
	/**
	 * �ֹι�ȣ ������ Ư�� Human ��ü�� �����Ѵ�.
	 * @param ssn
	 * @return
	 */
	public boolean delete(String ssn) {
		// ������� ����� �ִ��� �Ǻ�
		// select()�� ��ȯ���� ã�� Human�̰ų� null
		
		/*
		Human temp = select(ssn);
		
		if (temp == null) {
			return false;
		} else {
			return list.remove(temp);
		}
		*/
		
		// ArrayList.remove()�� overloading �Ǿ� �ִ�.
		// object�� �ѱ�� �ͺ��ٴ� index�� �ѱ�°� �ξ� ȿ�������� ���δ�.
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
	 * ���� ����� List�� ����� ��ȯ�Ѵ�.
	 * @return
	 */
	public int getListSize() {
		return list.size();
	}
	
	/**
	 * Ư�� index�� ��ġ�� Human ��ü�� ��ȯ�Ѵ�.
	 * @param index
	 * @return
	 */
	public Human getHuman(int index) {
		return list.get(index);
	}
	
	/**
	 * ���� ����� List�� ���� ����Ѵ�.
	 */
	public void printAll() {
		if (list.size() == 0) {
			System.out.println("��ϵ� ����� �����ϴ�.");
		} else {
			for (int index = 0; index < list.size(); index++) {
				System.out.println((index + 1) + ") " + list.get(index));
			}
		}
	}
}

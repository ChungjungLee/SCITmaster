package practice;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Human> list;
	// �� �ʵ忡�� ������ �ʱ�ȭ���� �ʴ°�?
	// �Ϲ������δ� �����ڸ� ���ؼ� �ʱ�ȭ�ϱ� ����
	
	/*
	 * Constructor
	 */
	public Manager() {
		list = new ArrayList<>();
	}
	
	// UI������ ��� ����� ������ �޶�� ��û�ϴ� Ŭ�����̱� ������
	// ��ɵ��� public���� ��������� �Ѵ�.
	
	/**
	 * Human ��ü�� �����Ѵ�.
	 * @param h
	 * @return
	 */
	public boolean insert(Human h) {
		boolean isAdded = list.add(h);
		// List�� ��Ͽ��θ� �˾Ƽ� ��ȯ
		// array�� ��Ͽ��θ� ���� Ȯ���ؾ� ��
		
		// TODO: �ֹι�ȣ�� ������ ����� �ִٸ� ��� �Ұ�
		
		return isAdded;
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
}

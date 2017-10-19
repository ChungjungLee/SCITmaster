package study;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "��");
		map.put(2, "��");
		map.put(3, "��");
		
		String v1 = map.get(1);
		System.out.println(v1);
		
		String v2 = map.get(2);
		System.out.println(v2);
		
		String v3 = map.get(3);
		System.out.println(v3);
		
		/*
		 * ArrayList�� ���, ������� ����Ǿ� �ֱ� ������ ���� ã�� ������
		 * ��� ���Ҹ� ���ؾ� �Ѵ�.
		 * 
		 * HashMap�� ���, ���� ���� ����, ���Ӽ� ���� ���������� Ű�� ������ �� ����
		 * ã�� �� �ִ�. Ű ��� ���� �����ϰ� ����ϱ� ������.
		 * �׷��� ���� �ߺ��� �Ǿ ��������� Ű�� �ߺ��� �־�� �� �ȴ�.
		 */
		
		HashMap<String, String> map2 = new HashMap<>();
		/*
		 * ���� ���� ���� Ŭ������ <>�� �ѱ�� ���� hashcode()�� �������ؾ� �ϹǷ�
		 * ���� �ܰ迡���� ����.
		 * Integer�� String�� ����ϵ��� �� ��
		 * 
		 */
		
		map2.put("OOP", "��ü ���� ���α׷���");
		map2.put("LAN", "Local Area Network");
		map2.put("GOD", "���̵��׷�");
		
		String b1 = map2.get("OOP");
		System.out.println(b1);
		
		String b2 = map2.get("LAN");
		System.out.println(b2);
		
		String b3 = map2.get("GOD");
		System.out.println(b3);
		
		// map�� �ش� key�� ������ �ִ��� �Ǵ��� �Ŀ� get()�� �ϴ� ���� �ξ� ������ ���!
		if (map2.containsKey("GOD")) {
			System.out.println(map2.get("GOD"));
		}
		
		
		
	}

}

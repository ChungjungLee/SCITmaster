
public class Rectangle {
	int w; //has-a ����
	int h;
	
	int area() {
		int area = w * h;
		return area;
		//return 100; �ϰ� �Ǹ� ������ 100 ��ȯ
	}
	
	int perimeter() {
		int perimeter = (w+h)*2;
		return perimeter;
		//��ȯ�� �ϰ� �Ǹ� �� �޼ҵ带 ȣ���� ���� 
		//��ȯ�ϰ� �ȴ�
	}
	
}

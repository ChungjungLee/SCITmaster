
public class Calculator {
	
	int kor;	//���� ����
	int mat;	//���� ����
	int eng;	//���� ����
	
	// ���� ����ؼ� ��ȯ�ϴ� �޼ҵ�
	// ��ȯ�� int�� return ���� ���� ��ȯ ���� Ÿ���� �˸�
	int getSum() {
		// ��ȯ�� �ϰڴٴ� ��
		int sum = kor + eng + mat;
		return sum;	//����� ��������
		// �� �޼ҵ带 ȣ���� ���� ���� sum���� ����
	}
	
	//
	double getAverage() {
		double avg = (kor + mat + eng) / 3.0;
		return avg;
	}
}

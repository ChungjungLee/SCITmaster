import java.util.Calendar;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car.print();
		
		Car car1 = new Car("blue", 1, 1);
		car1.print();
		
		Car car2 = new Car("green", 1, 1);
		car2.print();
		
		int id = car1.id_pub;
		//int id = car.id_pub; (x)
		//int num = car1.numberOfCars_pub; (o)
		int num = Car.numberOfCars_pub;
		/* ��ü�� �������� �ʴ���� static���� ����� �ֵ��� ����� ���� */
		/* ������ �ÿ� static���� ����� �ֵ��� �޸𸮿� �ε尡 �Ǳ� ���� */
		
		
		/* static ���� */
		Math.random();
		// random() �̶�� �޼ҵ�� Math Ŭ���� ���� static���� ����� �ִ�
		
		new Car().print();
		// �̰� Car class�� ��ü�� �ϳ� ���� �Ŀ� print()�� ���°��̱� ������
		// �� ���� Car.print()�ʹ� ���� �ٸ� ����
		
		
		/* static ���� */
		Calendar c = Calendar.getInstance();
		// Calendar 
		c.get(Calendar.YEAR);
		// YEAR ������ static���� ����Ǿ� �ִ�
		// ���α׷� �� �ϳ��� �����Ѵ�
		// calendar�� 'singleton pattern'�� �̿��ϱ� ������
		
		CalendarT ct = CalendarT.getInstance();
		ct.print();
	}

}

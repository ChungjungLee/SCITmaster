
public class Car_Test {
	public static void main(String[] args) {
		Car car = new Car();
		
		//
		car.color = "red";
		car.speed = 0;
		car.gear = 1;
		car.introduce();
		
		//���ǵ��
		car.speedUp(30);	//car ��ü�� �ʵ尡 �����
		car.introduce();
		
		//���ǵ�ٿ�
		car.speedDown(20);
		car.introduce();
		
		
	}
}

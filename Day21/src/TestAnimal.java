
public class TestAnimal {
	public static void main(String[] args) {
		
		// 추상클래스에는 아직 구현이 되지 않은 메소드가 있기 때문에
		// 객체를 생성하는 것이 불가능하다 
		//Animal a = new Animal();
		
		Dog d = new Dog();
		d.cry();
		
		Cat c = new Cat();
		c.cry();
	}
}


public class PersonTest {
	
	public static void main(String[] args) {
		PersonWithModifier p = new PersonWithModifier();
		
		//p.name = "���ڹ�";
		p.setName("���ڹ�");
		p.setAge(-20);
		p.setHeight(170);
		 
		
		System.out.println(p.getName());
	}
}
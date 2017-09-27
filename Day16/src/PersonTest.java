
public class PersonTest {
	
	public static void main(String[] args) {
		PersonWithModifier p = new PersonWithModifier();
		
		//p.name = "±èÀÚ¹Ù";
		p.setName("±èÀÚ¹Ù");
		p.setAge(-20);
		p.setHeight(170);
		 
		
		System.out.println(p.getName());
	}
}
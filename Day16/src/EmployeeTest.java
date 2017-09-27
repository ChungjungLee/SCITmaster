
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		
		employee.setName("ȫ�浿");
		employee.setTelephone("010-1234-5678");
		employee.setPay(5000);
		
		System.out.println("name: " + employee.getName());
		System.out.println("tel: " + employee.getTelephone());
		System.out.println("pay: " + employee.getPay());
	}

}

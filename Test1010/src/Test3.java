
public class Test3 {

	public static void main(String[] args) {
		//Account ac = new Account();
		Account ac1 = new Account(1, "±èÃ¶¼ö");
		
		ac1.print();
		
		Account ac2 = new Account(2, "ÀÌ¿µÈñ", 10000);
		
		System.out.println(ac2.getName());
		
		//ac2.balance = 1000;
		//ac2.setBalance(1000);
		
		ac2.deposit(1000);
		System.out.println(ac2.getBalance());
		
		ac2.withdraw(2000);
		System.out.println(ac2.getBalance());
		
		ac2.print();
	}

}

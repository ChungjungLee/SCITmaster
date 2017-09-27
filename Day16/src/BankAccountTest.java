
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankAcc1 = new BankAccount();
		BankAccount bankAcc2 = new BankAccount();
		
		bankAcc1.deposit(100);
		System.out.println("Balance: " + bankAcc1.getBalance());
		
		bankAcc1.withdraw(60);
		System.out.println("Balance: " + bankAcc1.getBalance());

		bankAcc1.addInterest();
		System.out.println("Balance: " + bankAcc1.getBalance());
		
		
		
		System.out.println("¿Ã√º »ƒ ¿‹∞Ì: " + bankAcc1.transfer(10, bankAcc2));
		System.out.println("S2¿« ¿‹∞Ì: " + bankAcc2.getBalance());
	}

}

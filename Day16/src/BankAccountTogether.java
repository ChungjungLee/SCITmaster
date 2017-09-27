/*
 * �ϳ��� ���� �ȿ��� ���� ���� Ŭ������ ������ ���� ������
 * ���� �ϳ��� Ŭ������ public���� ������ �� �ִ�.
 * �׸��� �� Ŭ���� �̸����� ������ �̸��� ���ؾ� �Ѵ�.
 * 
 * Ŭ������ default access modifier�� package-private�̶�� ��
 * */
class BankAccount2 {
//public class BankAccount2 (x)
	int balance;
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	int getBalance() {
		return balance;
	}
}

public class BankAccountTogether {

	public static void main(String[] args) {
		BankAccount2 bc = new BankAccount2();
		
		bc.deposit(10000);
		System.out.println("Balance: " + bc.getBalance());
		
		bc.withdraw(200);
		System.out.println("Balance: " + bc.getBalance());
	}

}

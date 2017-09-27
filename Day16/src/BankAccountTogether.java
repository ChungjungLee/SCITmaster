/*
 * 하나의 파일 안에서 여러 개의 클래스를 정의할 수는 있지만
 * 오직 하나의 클래스만 public으로 선언할 수 있다.
 * 그리고 그 클래스 이름으로 파일의 이름을 정해야 한다.
 * 
 * 클래스의 default access modifier는 package-private이라고 함
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

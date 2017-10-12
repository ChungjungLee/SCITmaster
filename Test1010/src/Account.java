
public class Account {
	private String name;
	private int accountNumber;
	private int balance;
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = 0;
	}
	
	public Account(int accountNumber, String name, int balance) {
		// 자기 자신의 생성자를 부를수 있다.
		//this(accountNumber, name);
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public void print() {
		System.out.printf("번호:%d 이름:%s 잔액:%d\n", accountNumber, name, balance);
	}
}

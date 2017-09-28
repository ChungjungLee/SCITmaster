
public class BankAccount {
	private String name;
	private String accountNum;
	private double balance;
	private int interest;
	
	public BankAccount() {
		name = null;
		accountNum = null;
		balance = 0.0;
		interest = 0;
	}
	
	public BankAccount(String name, String accountNum, double balance, int interest) {
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;
		this.interest = interest;
	}
}

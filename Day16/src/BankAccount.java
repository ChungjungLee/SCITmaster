
public class BankAccount {
	double balance;
	
	void deposit (int amount) {
		balance = balance + amount;
	}
	
	void withdraw (int amount) {
		// 통장 잔고가 마이너스로 떨어지지 않게 조건을 달자
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("금액 부족");
		}
		
		/*
		if (balance < amount) {
			System.out.println("금액 부족");
			return;
		}
		balance = balance - amount;
		*/
	}
	
	double getBalance () {
		return balance;
	}
	
	void addInterest() {
		balance = balance * 1.075;
	}
	
	/**
	 * 현재 계좌에서 다른 계좌로 금액을 송금한다
	 * @param amount 얼마나 금액을 송금할지
	 * @param otherAccount 송금받을 계좌
	 * @return balance 이체 후 계좌에 남아있는 잔고
	 */
	public double transfer(int amount, BankAccount otherAccount) {
		if (balance < amount) {
			return -1;
		}
		
		balance = balance - amount;
		otherAccount.deposit(amount);
		
		return balance;
	}
}

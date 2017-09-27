
public class BankAccount {
	double balance;
	
	void deposit (int amount) {
		balance = balance + amount;
	}
	
	void withdraw (int amount) {
		// ���� �ܰ� ���̳ʽ��� �������� �ʰ� ������ ����
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("�ݾ� ����");
		}
		
		/*
		if (balance < amount) {
			System.out.println("�ݾ� ����");
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
	 * ���� ���¿��� �ٸ� ���·� �ݾ��� �۱��Ѵ�
	 * @param amount �󸶳� �ݾ��� �۱�����
	 * @param otherAccount �۱ݹ��� ����
	 * @return balance ��ü �� ���¿� �����ִ� �ܰ�
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

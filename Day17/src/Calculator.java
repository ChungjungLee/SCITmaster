
/*
 * ���ϱ�, ����, ���ϱ�, ������, ���밪, ����� ��ȯ
 * */
public class Calculator {
	
	/* ���ϱ� */
	public int add(int left, int right) {
		return left + right;
	}
	
	public double add(double left, double right) {
		return left + right;
	}
	
	public double add(int left, double right) {
		return left + right;
	}
	
	/* ���� */
	public int subtract(int left, int right) {
		return left - right;
	}
	
	public double subtract(double left, double right) {
		return left - right;
	}
	
	/* ���ϱ� */
	public int multiply(int left, int right) {
		return left * right;
	}
	
	public double multiply(double left, double right) {
		return left * right;
	}
	
	/* ������ */
	public int divide(int left, int right) {
		return left / right;
	}
	
	public double divide(double left, double right) {
		return left / right;
	}
	
	/* ���밪 */
	public int absolute(int num) {
		if (num < 0) {
			return num * -1;
		} else {
			return num;
		}
	}
	
	public double absolute(double num) {
		return (num < 0) ? num * -1 : num;
	}
	
	/* ����� ��ȯ */
	public int signChange(int num) {
		return num * -1;
	}
	
	public double signChange(double num) {
		return num * -1;
	}
}

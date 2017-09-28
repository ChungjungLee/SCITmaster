
/*
 * 더하기, 빼기, 곱하기, 나누기, 절대값, 음양수 변환
 * */
public class Calculator {
	
	/* 더하기 */
	public int add(int left, int right) {
		return left + right;
	}
	
	public double add(double left, double right) {
		return left + right;
	}
	
	public double add(int left, double right) {
		return left + right;
	}
	
	/* 빼기 */
	public int subtract(int left, int right) {
		return left - right;
	}
	
	public double subtract(double left, double right) {
		return left - right;
	}
	
	/* 곱하기 */
	public int multiply(int left, int right) {
		return left * right;
	}
	
	public double multiply(double left, double right) {
		return left * right;
	}
	
	/* 나누기 */
	public int divide(int left, int right) {
		return left / right;
	}
	
	public double divide(double left, double right) {
		return left / right;
	}
	
	/* 절대값 */
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
	
	/* 음양수 변환 */
	public int signChange(int num) {
		return num * -1;
	}
	
	public double signChange(double num) {
		return num * -1;
	}
}


// interface는 extends(확장)가 아니고 implements(구현)이다
public class Calculator implements Calculable{

	@Override
	public double calculate(double x, double y) {
		return x + y;
	}
	
}

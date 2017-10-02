
public class ComplexNumber_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber cnum1 = new ComplexNumber();
		ComplexNumber cnum2 = new ComplexNumber();
		
		cnum1.setReal(4.0);
		cnum1.setImag(3.0);
		
		cnum2.setReal(1.0);
		cnum2.setImag(2.0);
		
		cnum1.addComplex(cnum2);
		cnum1.subtractComplex(cnum2);
		cnum1.multiplyComplex(cnum2);
		
		cnum1.divideComplex(cnum2);
	}

}

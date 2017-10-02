
public class ComplexNumber {
	private double real;
	private double imag;
	
	void print() {
		System.out.printf("%.2f + %.2f*i\n", real, imag);
	}
	
	double getReal() {
		return real;
	}
	
	double getImag() {
		return imag;
	}
	
	void setReal(double real) {
		this.real = real;
	}
	
	void setImag(double imag) {
		this.imag = imag;
	}
	
	void addComplex(ComplexNumber num) {
		ComplexNumber result = new ComplexNumber();
		
		result.setReal(num.getReal() + this.getReal());
		result.setImag(num.getImag() + this.getImag());
		
		result.print();
	}
	
	void subtractComplex(ComplexNumber num) {
		ComplexNumber result = new ComplexNumber();
		result.setReal(this.getReal() - num.getReal());
		result.setImag(this.getImag() - num.getImag());
		
		result.print();
	}
	
	void multiplyComplex(ComplexNumber num) {
		//(a + bi)(c + di) = ac + adi + bci - bd;
		
		ComplexNumber result = new ComplexNumber();
		result.setReal(
				this.getReal() * num.getReal() - this.getImag() * num.getImag()
		);
		result.setImag(
				this.getReal() * num.getImag() + this.getImag() * num.getReal()
		);
		
		result.print();
	}
	
	void divideComplex(ComplexNumber num) {
		//(a + bi)/(c + di) = (a + bi)(c - di)/(c + di)(c - di);
		//					= (a + bi)(c - di)/c^2 + d^2;
		
		ComplexNumber result = new ComplexNumber();
		ComplexNumber conjugate = new ComplexNumber();
		
		conjugate.setReal(num.getReal());
		conjugate.setImag(num.getImag() * -1);
		
		result.setReal(
				(this.getReal() * conjugate.getReal() - this.getImag() * conjugate.getImag()) 
				/ 
				(num.getReal() * num.getReal() + num.getImag() * num.getImag())
		);
		result.setImag(
				(this.getReal() * conjugate.getImag() + this.getImag() * conjugate.getReal())
				/
				(num.getReal() * num.getReal() + num.getImag() * num.getImag())
		);
		
		result.print();
	}
}

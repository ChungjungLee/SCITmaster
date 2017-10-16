
public class Box implements Comparable{

	private double volume = 0;
	
	public Box(double v) {
		this.volume = v;
	}
	
	@Override
	public int compareTo(Object otherObject) {
		Box other = (Box) otherObject;
		if (this.volume < other.volume) {
			// 같은 class 내부라 getVolume()할 필요 없이 .volume이 가능하다
			return -1;
		} else if (this.volume > other.volume) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Box b1 = new Box(100);
		Box b2 = new Box(85);
		
		if (b1.compareTo(b2) > 0) {
			System.out.println("b1이 더 크다");
		} else {
			System.out.println("둘이 같거나 b2가 더 크다");
		}
	}
	
}

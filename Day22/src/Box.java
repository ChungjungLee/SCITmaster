
public class Box implements Comparable{

	private double volume = 0;
	
	public Box(double v) {
		this.volume = v;
	}
	
	@Override
	public int compareTo(Object otherObject) {
		Box other = (Box) otherObject;
		if (this.volume < other.volume) {
			// ���� class ���ζ� getVolume()�� �ʿ� ���� .volume�� �����ϴ�
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
			System.out.println("b1�� �� ũ��");
		} else {
			System.out.println("���� ���ų� b2�� �� ũ��");
		}
	}
	
}

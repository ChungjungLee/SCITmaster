
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		
		System.out.println(box1.getVolume());
		
		Box box2 = new Box();
		
		box2.setHeight(200);
		box2.setLength(200);
		box2.setWidth(200);
		
		box2 = box1;
		
		System.out.println(box2.getHeight());
		
	}

}

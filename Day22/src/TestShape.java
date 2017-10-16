
public class TestShape {
	private static Shape[] arrayOfShapes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		drawAll();
	}
	
	public static void init() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new RectangleS();
		arrayOfShapes[1] = new TriangleS();
		arrayOfShapes[2] = new CircleS();
	}

	public static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}
}

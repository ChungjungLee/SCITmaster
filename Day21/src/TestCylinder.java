
public class TestCylinder {

	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.printf("radius:%f, area:%f, height:%f, volume:%f\n",
							obj1.getRadius(), obj1.getArea(), 
							obj1.getHeight(), obj1.getVolume());
		
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		System.out.printf("radius:%f, area:%f, height:%f, volume:%f\n",
							obj2.getRadius(), obj2.getArea(), 
							obj2.getHeight(), obj2.getVolume());
	}

}

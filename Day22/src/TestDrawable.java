
public class TestDrawable {

	public static void main(String[] args) {
		/*
		 * �츮�� ���ݱ��� ����ߴ� �迭�� ��� ����� Ÿ���� ���ҵ��� ��츸 ����ߴ�
		 * 
		 * �׷��� ���� interface�� �����ϰ� �ִ� Ŭ�����鵵 �迭�� ����� �����ϴ�
		 */
		Circle[] cList = new Circle[3];
		Drawable[] dList = new Drawable[3];
		
		dList[0] = new Circle();
		/*
		 * Circle�� Drawable�� �ȴٴ� �̾߱�. ����ȯ�� �Ǿ���.
		 */
		dList[1] = new Rectangle();
		dList[2] = new Triangle();
		
		for (Drawable d : dList) {
			/*
			 * ���������� ����ȯ�� �Ǿ���
			 */
			/*
			 * ��ü instanceof Ŭ������
			 * ��ü�� Ŭ������ Ÿ���� ��ü�Դϱ ���� ������
			 * 
			 * �� �̰Ÿ� ����ϴ°�?
			 * ������ �����Ͱ� ��ȿ����, � Ÿ�������� �˻��ϱ� ����,
			 * ��ǵ� ���(�ʵ�, �޼ҵ�)�� �ٽ� �������� ����ϰ� ���� ��
			 */
			if (d instanceof Circle) {
				System.out.println("��");
				//d.calArea();
				Circle circle = (Circle) d;
				circle.calArea();
				
			} else if (d instanceof Rectangle) {
				System.out.println("�簢��");
				
			} else {
				System.out.println("�ﰢ��");
				
			}
			d.draw();
		}
		
		/**
		 * ���� ����ȯ Up-Casting		ex) Drawable d = new Circle();
		 * �ڽ����κ��� �θ�� �ö󰡴� ����ȯ
		 * �ڽ��� ������ �ִ� �ʵ�, �޼ҵ� ���� �������� ���� �ȴ�.
		 * �θ� �˰� �ִ� �ʵ�� �޼ҵ常 ����� �����ϴ�
		 * 
		 * ���� ����ȯ Down-Casting	ex) Circle c = (Drawable) d;
		 * �θ�κ��� �ڽ����� �������� ����ȯ
		 * 
		 * ���� �����ϸ�, Ȯ��/������ Ŭ������ ���̴� ��: ���� ����ȯ
		 * Ȯ��/������ų Ŭ������ Ȯ��/������ Ŭ������ ���̴� ��: ���� ����ȯ
		 */
		Circle c = new Circle();
		c.calArea();
		Drawable d = (Drawable) c;
		// d.calArea();
		// Drawable ���忡���� calArea()�� ���� ��ü�� ���� error
		
		/*
		 * UpCasting �� ������ �ٽ� ���� Ÿ������ DownCasting�ؾ���
		 * �ٸ� Ÿ������ DownCasting���� �ϸ� �� �ȴ�.
		 */
		Rectangle r = new Rectangle();
		d = (Drawable) r;
		Rectangle r1 = (Rectangle) d;
		//Circle c1 = (Circle) d;
		
		
	}

}

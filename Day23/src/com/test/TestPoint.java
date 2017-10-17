package com.test;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 295page, Q8
		Point2D p = new Point3D();
		
		p.setX(100);
		//p.setZ(10);
		((Point3D)p).setZ(10);
		
		//Point3D p2 = new Point2D();
		Point3D p2 = (Point3D) new Point2D();
	}

}

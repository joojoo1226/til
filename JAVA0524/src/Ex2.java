
public class Ex2 {

	public static void main(String[] args) {

		Point3D p = new Point3D();
		
		p.print3D();
	}

}

class Point2D {
	
	int x = 10;
	int y = 20;
	
	public void print2D() {
		
//		System.out.println("x = " + x + ", y = " + y);
		System.out.println(x + ", " + y);
		
	}
	
}

class Point3D extends Point2D {
	
	int z = 30;
	
	public void print3D() {
		
		print2D();
		
		System.out.println("z = " + z);
		
	}
	
}


public class Ex {

	public static void main(String[] args) {

		int a1 = 32768;
		short a2 = 32767;
		
		System.out.printf("변환 전 a1(int) : %d, a2(short) : %d\n", a1, a2);
		System.out.println("변환 전 a1(int) : " + a1 + ", a2(short) : " + a2);
		
		a1 = a2;
		System.out.printf("변환 후 a1(int) : %d, a2(short) : %d\n", a1, a2);
		
		System.out.println("========================================");
		
		int b1 = 9999999;
		short b2 = 32767;
		
		System.out.printf("변환 전 b1(int) : %d, b2(short) : %d\n", b1, b2);
		
//		b2 = b1; //오버플로우
		b2 = (short)b1; //넘쳐도 상관없다. 집어넣어라!
		
		System.out.printf("변환 후 b1(int) : %d, b2(short) : %d\n", b1, b2);
		
		
		System.out.println("========================================");
		
		int c1 = 100;
//		short c2 = c1;
		short c2 = (short)c1;
		System.out.printf("변환 후 c1(int) : %d, c2(short) : %d\n", c1, c2);
		
		int d1 = 100;
		double d2 = 3.14;
		System.out.printf("변환 전 d1(int) : %d, d2(double) : %f\n", d1, d2);
		
		d2 = d1;
		System.out.printf("변환 후 d1(int) : %d, d2(double) : %.2f\n", d1, d2);
		
		System.out.println("========================================");

		int e1 = 100;
		double e2 = 3.14;
		System.out.printf("변환 전 e1(int) : %d, e2(double) : %f\n", e1, e2);
		
//		e1 = e2;
		e1 = (int)e2;
		
		System.out.printf("변환 후 e1(int) : %d, e2(double) : %f\n", e1, e2);
		
		long l = 100L;
		float f = l;
//		l = f;
		l = (long)f;
		
		

	}

}

package static_member;

public class Ex {

	public static void main(String[] args) {

		NormalMember n1 = new NormalMember();
		NormalMember n2 = new NormalMember();
		
		System.out.printf("n1.a : %d, n2.a : %d \n", n1.a, n2.a);
		System.out.printf("n1.b : %d, n2.b : %d \n", n1.b, n2.b);
		
		n1.a = 99;
		n1.b = 999;
		
		System.out.printf("n1.a : %d, n2.a : %d \n", n1.a, n2.a);
		System.out.printf("n1.b : %d, n2.b : %d \n", n1.b, n2.b);
		
		System.out.println("=================================================");
		
		System.out.println("StaticMember : " + StaticMember.a);
		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		System.out.printf("s1.b : %d, s2.b : %d \n", s1.b, s2.b);
		
		s2.a = 1000;
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		
		StaticMember.a = 500;
//		StaticMember.b = 500;
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		
		System.out.println("==================================================");
		
		System.out.println("PI 값 : " + Math.PI);
		
		
	}

}

class NormalMember {
	
	int a = 10;
	int b = 20;
	
}

class StaticMember {
	
	static int a = 10;
	int b = 20;
	
}
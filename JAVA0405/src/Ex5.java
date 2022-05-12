
public class Ex5 {

	public static void main(String[] args) {

		boolean a = false;
		boolean b = true;
		
		System.out.println("AND(&&) 연산 진리표");
		System.out.println("a(false) && a(false) = " + (a && a));
		System.out.println("a(false) && b(true) = " + (a && b));
		System.out.println("b(true) && a(false) = " + (b && a));
		System.out.println("b(true) && b(false) = " + (b && b));
		
		System.out.println("====================================");
		
		System.out.println("OR(||) 연산 진리표");
		System.out.println("a(false) || a(false) = " + (a || a));
		System.out.println("a(false) || b(true) = " + (a || b));
		System.out.println("b(true) || a(false) = " + (b || a));
		System.out.println("b(true) || b(false) = " + (b || b));
		
		System.out.println("====================================");
		
		System.out.println("NOT(!) 연산 진리표");
		System.out.println("!a(false) = " + (!a));
		System.out.println("!b(true) = " + (!b));
		
		System.out.println("XOR(^) 연산 진리표");
		System.out.println("a(false) ^ a(false) = " + (a ^ a));
		System.out.println("a(false) ^ b(true) = " + (a ^ b));
		System.out.println("b(true) ^ a(false) = " + (b ^ a));
		System.out.println("b(true) ^ b(false) = " + (b ^ b));
		
		System.out.println("====================================");

		int num = 1;
		
		System.out.println(num > 5);
		System.out.println(num < 10);
		
		System.out.println(num > 5 && num < 10);
		
		System.out.println(num < 0 || num > 100);
		
		num = 150;
		
		System.out.println(!(num < 0 || num > 100));
		System.out.println(num >= 0 && num <= 100);
	}

}

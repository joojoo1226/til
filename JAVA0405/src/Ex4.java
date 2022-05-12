
public class Ex4 {

	public static void main(String[] args) {
		
		int a = 10, b = 5;
		
		System.out.println("a > b 인가?" + (a > b));
		System.out.println("a >= b 인가?" + (a >= b));
		System.out.println("a <= b 인가?" + (a <= b));
		System.out.println("a < b 인가?" + (a < b));
		System.out.println("a == b 인가?" + (a == b));
		System.out.println("a != b 인가?" + (a != b));
		
		boolean result = a > b;
		System.out.println(result);
		
		System.out.println("====================================");
		
		System.out.println('A' > 'B');
		System.out.println('A' == 65);
		
		System.out.println(0.1 == 0.1f);
		System.out.println((float)0.1 == 0.1f);
		
		System.out.println("====================================");
		
		System.out.println(a + b > a - b);
	}
}

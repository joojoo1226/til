package method;

public class Test5 {

	public static void main(String[] args) {

		print("Hello, World!", 5);
		print("JAVA", 3);
	
		System.out.println("====================================");
		
		int maxN = max(10, 20);
		System.out.println(maxN);
		System.out.println(max(100, 100));
		System.out.println(Math.max(50, 20));
		
	}

	public static void print(String str, int num) {
		
		for(int i = 1; i <= num; i++) {
			System.out.println(str);
		}
		
	}
	
	public static int max(int x1, int x2) {
		
		if (x1 > x2) {
			return x1;
		} else {
			return x2;
		}
		
	}
	
}

package method;

public class Test4 {

	public static void main(String[] args) {

		int total = sum(10);
		
		System.out.println(total);
		
		System.out.println("=========================");
		
		String result = check(5);
		
		System.out.println(result);
		
	}

	public static int sum(int x) {
		
		int sum = 0;
		
		for (int i = 0; i <= x; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
	public static String check(int num) {
		
		if (num >= 0) {
			return "양수";
		} else {
			return "음수";
		}
		
	}
	
}

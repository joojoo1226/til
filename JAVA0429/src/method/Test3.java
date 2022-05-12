package method;

public class Test3 {

	public static void main(String[] args) {
		
		print("java");
		
		System.out.println("==========================");
		
		gugudan(2);
		gugudan(5);
		
		System.out.println("==========================");
		
		sum(100);
	}
	
	public static void print(String str) {

		for(int i=0; i<10; i++) {
			System.out.println(str);
		}
	}
	
	public static void gugudan(int dan) {
		System.out.println(dan + "단");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
	
	public static void sum(int x) {
		
		int sum = 0;
		
		for(int i = 0; i <= x; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
}

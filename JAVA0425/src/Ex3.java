
public class Ex3 {

	public static void main(String[] args) {
		
		int startNum = 1;
		int endNum = 10;
		
		for (int i = startNum; i <= endNum; i++) {
			System.out.println(i);
		}
		
		System.out.println("========================");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("*****");
		}
		
		System.out.println("==========================");
		
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

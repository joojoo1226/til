
public class Ex3 {

	public static void main(String[] args) {

		System.out.println("1 : Hello, World!");
		System.out.println("2 : Hello, World!");
		System.out.println("3 : Hello, World!");
		System.out.println("4 : Hello, World!");
		System.out.println("5 : Hello, World!");
		System.out.println("6 : Hello, World!");
		System.out.println("7 : Hello, World!");
		System.out.println("8 : Hello, World!");
		System.out.println("9 : Hello, World!");
		System.out.println("10 : Hello, World!");
		
		System.out.println("=============================================");
		
		int i = 0;
		
		for(i = 0; i <= 10; i++) {
			System.out.println(i + " : Hello, World!");
		}
		
		System.out.println("for문 종료 후 i 값 = " + i);
		
		System.out.println("============================================");

		for(i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("============================================");
		
		for(i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("============================================");
		
		for (i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		
	}

}

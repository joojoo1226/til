
public class Ex {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " : Hello, World!");
			
		}
		
		System.out.println("=========================");
		
		int i = 1;
		
		while (i <= 10) {
			System.out.println(i + " : Hello, World!");
			i++;
		}
		
		System.out.println("whlie문 종료 후 i값 = " + i);

		System.out.println("=========================");
		
		i = 1;
		while (i <=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println("========================");
		
		i = 1;
		while (i <= 10 ) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();
		System.out.println("==========================");
		
		i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		System.out.println("===========================");
		
		i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
		System.out.println();
		System.out.println("============================");
		
		i = 0;
		
		while(i < 10 ) {
			i++;
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("whlie문 종료 후 i값 = " + i);
		
	}

}

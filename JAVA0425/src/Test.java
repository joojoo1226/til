
public class Test {

	public static void main(String[] args) {

		int i = 1;
		int total = 0;
		
		System.out.println("2단");
		
		while(i < 10) {
			System.out.println("2 * " + i + " = " + 2 * i);
			i++;
		}
		
		System.out.println("==============================");
		
		i = 0;
		
		while(i <= 10 ) {
			System.out.printf(i + " ");
			total += i;
			i++;
		}
		System.out.println(total);
		
		
	}
}

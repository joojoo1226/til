
public class Test4 {

	public static void main(String[] args) {

		int total = 0;
		int i = 0;
		
		for (i = 1; i <= 100; i++) {
			total += i;
			
			if (total >= 1000) {
				break;
			}
		}
		System.out.println(total);
		System.out.println(i);
		
		System.out.println("=======================");
		
		for (i = 1; i < 10000; i++) {
			if (i % 2 == 0) {
				i = -i;
			}
			
			total += i;
			
			if(total >= 100) {
				break;
			}
		}
		System.out.println(i);
		
//		i = 1;
//		while() {
//			
//		}
	}

}

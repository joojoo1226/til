
public class Test {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;

		for (i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		System.out.println("=====================================");
		
		sum = 0;
		
		for (i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		System.out.println("=============================");
		
		int oddTotal = 0;
		int evenTotal = 0;
		
		for(i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				oddTotal += i;
			} else {
				evenTotal += i;
			}
		}
		
		System.out.println("홀수 합 : " + oddTotal + ", 짝수 합 : " + evenTotal);
	}
	
}


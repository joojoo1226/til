
public class Ex {

	public static void main(String[] args) {
		
		int num = 0;
		
		if(num > 0) {
			System.out.println(num + " : 양수!");
		} else if(num < 0) {
			System.out.println(num + " : 음수!");
		} else {
			System.out.println(num + " : 0이다!");
		}
		
		System.out.println("=========================");
		
		num = 0;
		
		if(num % 2 == 1) {
			System.out.println("홀수");
		} else if (num == 0) {
			System.out.println("0");
		} else {
			System.out.println("짝수");
		}
		
		System.out.println("========================");
		
		num = 15;
		
		if(num > 5) {
			System.out.println(num + "은 5보다 크다!");
		} else if(num > 10) {
			System.out.println(num + "은 10보다 크다!");
		} 
		
		if (num > 10) {
			System.out.println(num + "은 10보다 크다!");
		} else if (num > 5) {
			System.out.println(num + "은 5보다 크다!");
		}
		
	}
}


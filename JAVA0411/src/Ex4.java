
public class Ex4 {

	public static void main(String[] args) {
		
		int num = 5;
		
		if (num < 0) {
			System.out.println("음수이므로 양수로 전환!");
			num = -num;
		} else {
			System.out.println("양수이므로 변환 생략!");
		}
		
		System.out.println("num 의 절대값 : " + num);
		
		System.out.println("================================");
		
		int num2 = 10;
		
		if(num2 % 2 == 1) {
			System.out.println(num2 + " : 홀수!");
		} else {
			System.out.println(num2 + " : 짝수!");
		}
		
		
		
			
	}
}


public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작!");
		
		int num = 4;
		
		if(num < 5) {
			System.out.println(num + "이(는) 5보다 작다!");
		}
		System.out.println("프로그램 종료!");
		
		System.out.println("==================================");
		
		int num2 = 10;
		
		if(num2 < 0) {
			num2 = -num2;
			System.out.println("음수를 양수로 변환!");
		}
		System.out.println("num2의 절대값 : " + num2);
	}
}

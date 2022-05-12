
public class Test_r {

	public static void main(String[] args) {

		int visitCount = 0;
		
		System.out.println("visitCount = " + visitCount);
		
		if (visitCount == 0) {
			System.out.println("처음 오셨습니다. 방문해 주셔서 감사합니다.");
		} 
		
		System.out.println("방문 횟수는 " + visitCount + "번 입니다.");

		System.out.println("==========================================================");
		
		int num = 0;
		
		if ((num % 3 == 0) || (num % 5 == 0)) {
			System.out.println("3의 배수 이거나 5의 배수 입니다.");
		} else {
			System.out.println("3의 배수 이거나 5의 배수가 아닙니다.");
		}
		
		System.out.println("==================================================================");
		
		char ch = 'a';
		
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			
		}
		
	}

}

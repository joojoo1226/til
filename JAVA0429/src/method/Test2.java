package method;

public class Test2 {

	public static void main(String[] args) {
		// 2. 매개변수는 없고, 리턴값만 있는 메서드 호출 연습
		// getName() 메서드를 호출한 후 리턴값(자신의 이름 = 문자열)을 변수에 저장 후 출력
		String name = getName();
		System.out.println("이름 : " + name);
		
		// getAge() 메서드를 호출하여 리턴되는 나이(age)를 변수에 저장하거나 직접 출력
		System.out.println("나이 : " + getAge());
		
		// sum() 메서드를 호출하여 1 ~ 10 까지의 합을 리턴받아 변수 sum 에 저장 후 출력
		int sum = sum();
		System.out.println("1 ~ 10 까지의 합 = " + sum);
		
		System.out.println(check());
	}
	
	// 2. 매개변수는 없고, 리턴값만 있는 메서드 정의 연습
	// ----------------------------------------------------
	// 정수 1개를 저장한 후 양수 or 음수를 판별하여 결과(문자열)를 리턴하는 check() 메서드 정의
	public static String check() {
		int num = 10;
		
		// 양수 or 음수 판별
//		if(num >= 0) {
//			return "양수!";
//		}
		// => 위의 코드는 if문의 판별 결과가 true 일 때만 실행되므로
		//    false 일 경우에는 실행되는 return 문이 없다! 오류 발생함!
		
//		if(num >= 0) {
//			return "양수!";
//		} else if(num < 0) {
//			return "음수!";
//		}
		// => 양수와 음수를 모두 판별하고 있지만 else 문이 없으므로
		//    두 조건이 모두 false 일 때 실행할 return 문이 없어서 오류 발생함!
		// 해결책1) else if 문 대신 else 문으로 처리하면 return 문이 모든 조건에서 실행됨
		// 해결책2) 
		
//		if(num >= 0) {
//			return "양수!";
//		} else {
//			return "음수!";
//		}
		
		String result = "";
		
		if(num >= 0) {
			result = "양수!";
		} else if(num < 0) {
			result = "음수!";
		}
		
		return result;

//		System.out.println();
	}
	
	// ====================================================
	// 1 ~ 10 까지의 합(정수)을 리턴하는 sum() 메서드 정의
	public static int sum() {
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		return total;
	}
	
	// ====================================================
	// 자신의 나이(정수)를 리턴하는 getAge() 메서드 정의
	public static int getAge() {
		return 20;
	}
	
	// ====================================================
	// 자신의 이름(문자열)을 리턴하는 getName() 메서드 정의
	public static String getName() {
		return "이연태";
	}
	
}

package method;

public class Test {
	
	public static void main(String[] args) {
		// "Hello, World!" 10번 출력하기
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello, World!");
		}
		
		System.out.println("--------------------");
		
		// 1. 매개변수도 없고, 리턴값도 없는 메서드 연습
		// hello() 메서드를 호출하여 "Hello, World!" 문자열 10번 출력
		hello();
		System.out.println("-----");
		// 언제든 hello() 메서드를 호출하기만 하면 문자열 10번 출력됨
		hello();
		
		System.out.println("===============================");
		// gugudan() 메서드 호출
		gugudan();
		
		System.out.println("===============================");
		// sum() 메서드 호출
		sum();
		
	} // main() 메서드 끝

	// 1 ~ 10 까지의 합(55)을 출력하는 sum() 메서드 정의
	public static void sum() {
		int total = 0; // 합계를 누적할 변수
		
//		for(int i = 1; i <= 10; i++) {
//			total += i;
//		}
		
		for(int i = 1; i <= 10; i++) {
			total += i;
			
			// 만약, 메서드 내에서 어떤 조건이 만족했을 경우 메서드 수행을 즉시 종료하고
			// 원래 호출한 곳으로 되돌아가고 싶을 경우 return 문 사용 가능
			// ex) 합계(total)가 30을 초과하는 즉시 출력문 실행하지 않고 바로 종료할 경우
			if(total > 30) {
				System.out.println("합계가 30을 초과함!");
				return; // 현재 메서드 실행을 즉시 종료함
			}
		}
		// 만약, for문 내에서 return 문이 실행되면 이 부분의 코드들은 실행될 수 없다!
		System.out.println("1 ~ 10 까지의 합 = " + total);
	}
	
	// =========================================================
	
	// 구구단 2단을 출력하는 gugudan() 메서드 정의
	public static void gugudan() {
		int dan = 2;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	// =========================================================
	
	// 1. 매개변수도 없고, 리턴값도 없는 메서드 정의 연습
	// "Hello, World!" 문자열을 10번 출력하는 hello() 메서드 정의
	public static void hello() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello, World!");
		}
	}
	
} // Test 클래스 끝












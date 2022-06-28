
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

/*비교범위가 좁은 조건식부터! 비교를 수행해야 합니다~
 * 자 이거는 다시 내용을 보면서 적어볼게요~
 * if 조건식1! 괄호열고~ 괄호닫고~
 * 만약에 거짓이라면! 엘스이프를 해서요~ 조건식2를 줘서!
 * 여기에~ 조건식2의 결과가 트루일때 아니 여기~ 조건식 1의 결과가 펄스이고 조건식2의 결과가 트루일 때
 * 또 엘스 이프가 하ㅏ나 더 들어오면은~ 조건식 3!을 써서요~
 * 조건식1부터 엔마이너스~1! 결과가 펄스이고~ 조건식 엔~의 결과가 트루일 때 실행되는 구조이구여~
 * 마지막에 엘스를 써서~ 위의 모든 조건식 엔까지요~ 포함해서~ 조건식 결과가 펄스일때!
 * 마지막 엘스~문은~ 생략 가능합니다~
 * 이 엘스를 꼭 안 쓰셔도 돼요~
 * 그러면 내용 한 번 보겠습니다~
 * 
 */
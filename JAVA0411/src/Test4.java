
public class Test4 {

	public static void main(String[] args) {
		
		System.out.println("아이티윌로 걸어서 출발!");
		
		int money = 5000;
		
		if(money >= 5000) {
			System.out.println("택시타고 가기!");
		} else {
			System.out.println("버스타고 가기!");
		}
		
		System.out.println("아이티윌에 도착!");
		
		System.out.println("===========================");
		
		int age = 30;
		
		if(age >= 20 && age <= 29) {
			System.out.println("당신은 20대 입니다!");
		} else {
			System.out.println("당신은 20대가 아닙니다!");
		}
		
		System.out.println("===========================");
		
		age = 26;
		
		if(age < 5 || age >= 65) {
			System.out.println("무료입장 대상입니다!");
		} else {
			System.out.println("무료입장 대상이 아닙니다!");
		}

		System.out.println("===========================");
		
		char ch = 'D';
		
		if(ch >= 65 && ch <= 90) {
			System.out.println("대문자!");
		} else {
			System.out.println("대문자가 아님!");
		}
		
		System.out.println("===========================");
		
		ch = 'd';
		
		if(ch >= 97 && ch <= 112) {
			ch = (char)(ch - 32); // ch -= 32;
			System.out.println("대문자 변환 결과 : " + ch);
		} else {
			System.out.println(ch + "소문자가 아님!");
		}
		
		
		
	}
}

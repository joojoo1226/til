
public class Test {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : 대문자!");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : 소문자!");
		} else if (ch >= '0' && ch  <= '9') {
			System.out.println(ch + " : 숫자!");
		} else {
			System.out.println(ch + " : 기타 문자!");
		}
		
		System.out.println("=============================");
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : 대문자!");
			ch += 32;
			System.out.println("소문자 변환 후 : " + ch);
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : 소문자!");
			ch -= 32;
			System.out.println("대문자 변환 후 : " + ch);
		} else {
			System.out.println(ch + " : 변환불가!");
		}
		
		System.out.println("=============================");
		
		int score = 50;
		String grade = "";
		
		if (score >= 90 && score <=100) {
			grade = "A";
//			System.out.println(score + "점의 학점은 " + grade + "입니다.");
		} else if(score >=80 && score <=89) {
			grade = "B";
//			System.out.println(score + "점의 학점은 " + grade + "입니다.");
		} else if(score >=70 && score <=79) {
			grade = "C";
//			System.out.println(score + "점의 학점은 " + grade + "입니다.");
		} else if(score >=60 && score <=69) {
			grade = "D";
//			System.out.println(score + "점의 학점은 " + grade + "입니다.");
		} else if(score >=0 && score <=59) {
			grade = "F";
//			System.out.println(score + "점의 학점은 " + grade + "입니다.");
		}
		System.out.println(score + "점의 학점은 " + grade + "입니다.");
		
		
		
	}
}

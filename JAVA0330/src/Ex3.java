
public class Ex3 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		System.out.println("박송주");
		
		int age = 20;
		System.out.println("나이는 age세 입니다.");
		System.out.println("나이는 " + age + "세 입니다.");
		
		System.out.println("--------------");
		
		System.out.print("Hello, World!");
		System.out.print("박송주");
		System.out.println();
		System.out.print("Hello, World!");
		System.out.print("박송주");
		System.out.print(1);
		System.out.println();
		System.out.println("--------------");
		
		System.out.printf("Hello, World!");
		System.out.printf("박송주");
		System.out.println();
		
		System.out.printf("%d", 1);
		System.out.println();
		System.out.printf("나이는 %d세 입니다.", 20);
		System.out.printf("나이는 %d세 입니다.", age);
		
		System.out.println();
		System.out.printf("현재 시각은\n %02d시 %02d분 %02d초 입니다.", 2, 57, 34);
		
		System.out.println();
		System.out.printf("평균 나이는 %.1f세 입니다.\n", 27.5);
		
		System.out.printf("정수 65에 해당하는 문자는 %c\n", 'A');
		System.out.printf("정수 65에 해당하는 문자는 %c\n", 65);
		
		char ch = 'r';
		System.out.printf("%c\n", ch);
		
		String str = "아이티윌 부산교육센터";
		System.out.printf("교육기관명 : %s\n", str);
	
	}

}

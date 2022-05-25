package static_member;

public class Ex3 {

	int b = check("인스턴스 변수 b");
	
	static int a = check("static 변수 a");

	public static int check(String str) {
		
		System.out.println("check() 호출 : " + str);
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("main() 메서드 호출");
		
		Ex3 ex = new Ex3();
		
		System.out.println("Ex3 인스턴스 생성 완료!");
		
	}
	
	static int c = check("static 변수 c!");
	
}

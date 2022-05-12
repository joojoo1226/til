
public class Ex2 {

	public static void main(String[] args) {

		PrintClass pc = new PrintClass();
		
		pc.print();
		
		System.out.println("===================================================");
		
		pc.print("홍길동");
		
		System.out.println("===================================================");
		
		pc.print("홍길동", "이순신");
		
		System.out.println("===================================================");
		
		pc.print("홍길동", "이순신", "강감찬");
	}

}


class PrintClass {
	
	public void print() {
		System.out.println("print() 메서드 호출됨!");
//		System.out.println("초대 멤버 : 없음 없음 없음");
		
		print("없음", "없음", "없음");
	}
	
	public void print(String name1) {
		System.out.println("print(String)메서드 호출됨!");
//		System.out.println("초대 멤버 : " + name1 + " 없음 없음");
		
		print(name1, "없음", "없음");
	}
	
	public void print(String name1, String name2) {
		System.out.println("print(String, String) 메서드 호출됨!");
//		System.out.println("초대 멤버 : " + name1 + " " + name2 + " 없음");
		
		print(name1, name2, "없음");
		
	}
	
	public void print(String name1, String name2, String name3) {
//		System.out.println("print(String, String, String) 메서드 호출됨!");
		System.out.println("초대 멤버 : " + name1 + " " + name2 + " " + name3);
		
//		print(name1, name2, name3);
	}
	
}
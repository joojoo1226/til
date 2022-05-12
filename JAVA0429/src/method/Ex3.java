package method;

public class Ex3 {
	
	public static void main(String[] args) {
		
		System.out.println("200원 드림");
		
//		sister_3(200); //리터럴 직접 전달
		
		int coin = 200;
		
		sister_3(coin);
		
	}
	
	public static void sister_3(int money) {
		
		System.out.println(money + "원 받음");
		
		money -= 200;
		
		System.out.println("이제 " + money + "원 남음");
	}
	
}
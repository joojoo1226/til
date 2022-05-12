//매개변수 2개이상

package method;

public class Ex5 {

	public static void main(String[] args) {

		System.out.println("새우깡이랑 1000원으로 쿠쿠? 바꿔왕");
		
		String snack = sister_5("새우깡", 1000);
		System.out.println(snack + " 원했어");
		
	}
	
	public static String sister_5(String snack, int money) {
		
		System.out.println(snack + " & " + money + "원을 얻었다!");
		
		snack = "쿠쿠";
		money -= 1000;
		
		System.out.println(snack + " 바꿈");
		
		return snack;
		
	}

}

//매개변수 o 리턴값 o

package method;

public class Ex4 {

	public static void main(String[] args) {
		
		System.out.println("돈줄테니까 내꺼도 사와");
		String snack = sister_4(1000);
		
		System.out.println(snack + "받음");
		
	}
	
	public static String sister_4(int money) {
		
		System.out.println(money + "원 받음");
		
		money -= 200;
		
		String snack = "새우깡";
		
		System.out.println(snack + "사고" + money + "원 남음");
		
//		return snack, money;
		return snack;
		
	}

}

package method;

public class Test5_2 {

	public static void main(String[] args) {

		cal(3500, 5000);
		cal(5000, 3500);
		
		System.out.println("===============================");
		
		cal2(3500, 10000);
		
	}
	
	public static void cal(int price, int money) {
		
		if (price > money) {
			System.out.println("금액이 모자랍니다!");
		} else {
			System.out.println("잔돈 : " + (money - price));
		}
		
	}
	
	public static void cal2(int price, int money) {
		
		
		
		if (price > money) {
			System.out.println("금액이 모자랍니다!");
		} else {
			int change = money - price;
			
			int w1000 = 0;
			int w500 = 0;
			int w100 = 0;
			int w50 = 0;
			int w10 = 0;
			
			w1000 = change / 1000;
			change = change % 1000;
			w500 = change / 500;
			change = change % 500;
			w100 = change / 100;
			change = change % 100;
			w50 = change / 50;
			change = change % 50;
			w10 = change / 10;
			change = change % 10;
		
			System.out.println("1000원 : " + w1000);
			System.out.println("500원 : " + w500);
			System.out.println("100원 : " + w100);
			System.out.println("50원 : " + w50);
			System.out.println("10원 : " + w10);
		}
		
	}

}

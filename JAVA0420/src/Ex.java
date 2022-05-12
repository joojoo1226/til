
public class Ex {

	public static void main(String[] args) {

//		int num = 1;
//		int sum = 0;
		
//		sum = sum + num;
//		num++;
//		반복..
		
		int total = 0;
		
		for (int i = 1; i <= 10; i++) {
			total += i;
			System.out.println("i = " + i + ", total = " + total);
		}
		
		System.out.println("1~10까지 정수 합 = " + total);
	}

}


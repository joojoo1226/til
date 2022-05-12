
public class Ex2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("i = " + i);
			
			for(int j = 1; j <= 2; j++) {
				System.out.println("-----> j = " + j);
			}
			
			System.out.println("-----안쪽 for문 반복 종료");
		}
		
		System.out.println("바깥쪽 for문 반복 종료");
	}

}


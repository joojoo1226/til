
public class Test3 {

	public static void main(String[] args) {

		int i = 0;
		
		for (i = 1; i <= 9; i++) {
			System.out.println(i);
		}
		
		System.out.println("====================");
		
		System.out.println(" < 2단 > ");
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		System.out.println("2 * 4 = 8");
		System.out.println("2 * 5 = 10");
		System.out.println("2 * 6 = 12");
		System.out.println("2 * 7 = 14");
		System.out.println("2 * 8 = 16");
		System.out.println("2 * 9 = 18");
		
		System.out.println("====================");
		
		int dan = 8;
		
		if (dan >= 1 && dan <= 9) {
			System.out.println("< " + dan + "단 >");
			
			for (i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
			
		} else {
			System.out.println("구구단이 아니에용.. 다시 입력해주세욥!");
		}
		
		System.out.println("====================");
		
		for (i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
	}

}


public class Test2 {

	public static void main(String[] args) {

		int min = 0;
		int sec = 0;
		
		while(min <= 59) {
			sec = 0;
			while(sec <= 59) {
				System.out.println(min + "분 " + sec + "초");
				sec++;
			}
			min++;
		}
		
		System.out.println("===========================");
		
		int dan = 1;
		int i = 1;
		
		while(dan <= 9) {
			System.out.println("\n" + dan + "단");
			
			i = 1;
			
			while (i <= 9) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
//				System.out.printf("%d * %d = %d", dan, i, dan * i);
				i++;
			}
			dan++;
		}
		
		System.out.println("=============================");
		
		
	}
}


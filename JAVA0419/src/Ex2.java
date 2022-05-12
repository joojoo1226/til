
public class Ex2 {

	public static void main(String[] args) {
		
		int month = 12;
		
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
				System.out.println(month + "월 한 달은 31일 출력");
				break;
			case 4 : case 6 : case 9 : case 11 : 
				System.out.println(month + "월 한 달은 30일 출력");
				break;
			case 2 : 
				System.out.println(month + "월 한 달은 28일 출력");
				break;
		}
		
	}

}

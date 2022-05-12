
public class Test2 {

	public static void main(String[] args) {
		int score = 100;
		
		switch(score) {
			case 100 : 
				System.out.println("A학점!");
				break;
			case 99 : 
				System.out.println("A학점!");
				break;
			case 98 : 
				System.out.println("A학점!");
				break;
			case 89 : 
				System.out.println("B학점!");
				break;
			case 88 : 
				System.out.println("B학점!");
				break;
			case 1 : 
				System.out.println("F학점!");
				break;
			case 0 : 
				System.out.println("F학점!"); 
				break;
		}
		
		System.out.println("=================================================================");

		score = 9105;
//		switch(score / 10) {
//			case 10 : case 9 :
//				System.out.println(score + " : A학점!");
//				break;
//			case 8 :
//				System.out.println(score + " : B학점!");
//				break;
//			case 7 :
//				System.out.println(score + " : C학점!");
//				break;
//			case 6 :
//				System.out.println(score + " : D학점!");
//				break;
//			case 5 : case 4 : case 3 : case 2 : case 1 : case 0 : 
//				System.out.println(score + " : F학점!");
//				break;
//			default :
//				System.out.println("그게 점수가 맞나욥..?");
//				break;
//		}
		
		if (score >= 0 && score <= 100) {
			switch(score / 10) {
				case 10 : case 9 :
					System.out.println(score + " : A학점!");
					break;
				case 8 :
					System.out.println(score + " : B학점!");
					break;
				case 7 :
					System.out.println(score + " : C학점!");
					break;
				case 6 :
					System.out.println(score + " : D학점!");
					break;
				default :
					System.out.println(score + " : F학점!");
					break;
			}
		} else {
			System.out.println("점수 다시 입력");
		}
		
	}
}

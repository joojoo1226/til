
public class Ex {

	public static void main(String[] args) {
		
		int num = 2;
		
		switch(num) {
			case 1 :
				System.out.println("num = 1");
			case 2 :
				System.out.println("num = 2");
			case 3 :
				System.out.println("num = 3");
		}
		
		System.out.println("=========================");
		
		num = 2;
		
		switch(num) {
			case 1 :
				System.out.println("num = 1");
			case 2 :
				System.out.println("num = 2");
			case 3 :
				System.out.println("num = 3");
			default:
				System.out.println("일치하는 case 문이 없음!");
		}
		
		System.out.println("========================");
		
		switch(num) {
			case 1 :
				System.out.println("num = 1");
				break;
			case 2 :
				System.out.println("num = 2");
				break;
			case 3 :
				System.out.println("num = 3");
				break;
			default:
				System.out.println("일치하는 case 문이 없음!");
		}
		
		System.out.println("========================");
		
		switch("KOREA") {
			case "대한민국" :
				System.out.println("대한민국!");
				break;
			case "KOREA" :
				System.out.println("KOREA!");
				break;
			case "한국" :
				System.out.println("한국!");
				break;
			default :
				System.out.println("다른 나라!");
				break;
		}
		
		System.out.println("=========================");
		
		switch(10 / 2) {
			
		}
	}
}

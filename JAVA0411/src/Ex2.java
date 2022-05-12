
public class Ex2 {

	public static void main(String[] args) {
		
		int num = 0;
		
		System.out.println(num >= 0);
		System.out.println(num >= 0 ? "num은 양수!" : "num은 음수!");
		
		String result = num >= 0 ? "num은 양수!" : "num은 음수!";
		System.out.println(result);
		
		System.out.println("=======================================");
		
		result = num > 0 ? "num은 양수!" : num < 0 ? "num은 음수" : "num은 0" ;
		System.out.println(result);
		
	}
}

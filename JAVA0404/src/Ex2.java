
public class Ex2 {

	public static void main(String[] args) {

		byte b = 100;
		short s = 65;
		
		char ch;
		
//		ch = b;
		ch = (char)b;
		System.out.println(ch);
		
//		b = ch;
		b = (byte)ch;
		System.out.println(b);
		
		System.out.println("========================================");
		
//		ch = s;
		ch = (char)s;
		System.out.println(ch);
		
//		s = ch;
		s = (short)ch;
		System.out.println(s);
		
		System.out.println("========================================");

		int i = ch;
		System.out.println(i);
		
	}

}

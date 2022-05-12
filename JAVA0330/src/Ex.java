
public class Ex {

	public static void main(String[] args) {
		
		byte b = 100;
		
		System.out.println(b);
		
		b = 127;
		b = -128;
		
		System.out.println(b);
		
		short s = 128;
		
		System.out.println(s);
		
		s = 32767;

		int i = 32768;
		
		System.out.println(i);
		
		i = 2147483647;
		
		long l = 2147483648L;
		
		System.out.println(l);
		
		double d = 3.14;
		float f = 3.14f;
		
		System.out.println(d);
		System.out.println(f);
		
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		
		System.out.println("=================================================");
		
		int num = 10;
		System.out.println(num);
		
		num = 0b1010;
		System.out.println(num);
		
		num = 012;
		System.out.println(num);
		
		num = 0xA;
		num = 0xa;
		System.out.println(num);
		
	}
}


public class Ex {

	public static void main(String[] args) {
		
		byte a = 10;
		
//		a = a + 1; //byte + int = int 이므로 불가
		a = (byte)(a + 1);
		
		a += 1;
		
		a++;
		
		System.out.println(a);
		
		System.out.println("===========================");
		
		int b = 5;
		
		b++;
		System.out.println(b);
		
		++b;
		System.out.println(b);
		
		b--;
		System.out.println(b);
		
		--b;
		System.out.println(b);
		
		System.out.println("===========================");

		int x1 = 5;
		int y1 = ++x1; //전위연산자(선행연산자)
		
		System.out.println("x1의 값 : " + x1 + ", y1의 값 : " + y1);
		
		int x2 = 5;
		int y2 = x2++; //후위연산자
		
		System.out.println("x2의 값 : " + x2 + ", y2의 값 : " + y2);
		
		System.out.println("===========================");

		x2 = 5;
		System.out.println(++x2);
		
		System.out.println(x2++); //출력문에 x2 먼저 전달 후, 증감연산자 사용
		
		System.out.println(x2);

		System.out.println("===========================");
		
		char ch = 'A';
		
		System.out.println(ch + 1);
		
		System.out.println(ch);
		
		System.out.println(ch++); //출력하고 ++해라
		
		System.out.println(++ch);
		
		System.out.println(ch);
		
		int x3 = 10;
		int y3 = 20;
		int z3 = ++x3 + y3--;
		System.out.println(x3);
		System.out.println(y3);
		System.out.println(z3);
		
	}
}

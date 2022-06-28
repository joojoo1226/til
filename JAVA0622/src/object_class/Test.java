package object_class;

public class Test {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		
		if(s1 == s2) {
			System.out.println("s1과 s2는 주소값이 같다!");
		} else {
			System.out.println("s1과 s2는 주소값이 다르다!");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 문자열 내용이 같다!");
		} else {
			System.out.println("s1과 s2는 문자열 내용이 다르다!");
		}
		
		System.out.println("==================================================");
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		if(s3 == s4) {
			System.out.println("s3과 s4는 주소값이 같다!");
		} else {
			System.out.println("s3과 s4는 주소값이 다르다!");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3과 s4는 문자열 내용이 같다!");
		} else {
			System.out.println("s3과 s4는 문자열 내용이 다르다!");
		}
		
	}

}

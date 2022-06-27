<<<<<<< HEAD

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println("PI 값 = " + Math.PI);
		
		String str = new String();
		String str2 = "hello";
		
	}
	
}

class FinalMember {
	
	final int finalMember = 10;
	final int blankFinalMember;

	public FinalMember(int blankFinalMember) {
		
		super();
		
		this.blankFinalMember = blankFinalMember;
		
	}
	
	public void change() {
		
//		finalMember = 99;
		
		System.out.println("finalMember = " + finalMember);
		
		final int finalLocalVar = 20;
//		finalLocalVar = 99;
		
	}
	
	public int getFinalMember() {
		
		return finalMember;
		
	}
	
}

class FinalMethod {
	
	public final void finalMethod() {
		
		System.out.println("슈퍼클래스의 finalMethod()");
		
	}
	
	public void normalMethod() {
		
		System.out.println("슈퍼클래스의 normalMethod()");
		
	}
	
}

class subFinalMethod extends FinalMethod {

	@Override
	public void normalMethod() {

		System.out.println("서브클래스에서 오버라이딩 된 normalMethod()");
		
		finalMethod();
	
	}
	
}

final class FinalClass {
	
	int num = 10;
	
	public void method() {
		
		System.out.println("슈퍼클래스의 method()");
		
	}
	
}

class subFinalClass {
	
	FinalClass fc = new FinalClass();
	
}

//class SubString extends String {
//	
//}
//
//class SubMath extends Math {
//	
//}
=======

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println("PI 값 = " + Math.PI);
		
		String str = new String();
		String str2 = "hello";
		
	}
	
}

class FinalMember {
	
	final int finalMember = 10;
	final int blankFinalMember;

	public FinalMember(int blankFinalMember) {
		
		super();
		
		this.blankFinalMember = blankFinalMember;
		
	}
	
	public void change() {
		
//		finalMember = 99;
		
		System.out.println("finalMember = " + finalMember);
		
		final int finalLocalVar = 20;
//		finalLocalVar = 99;
		
	}
	
	public int getFinalMember() {
		
		return finalMember;
		
	}
	
}

class FinalMethod {
	
	public final void finalMethod() {
		
		System.out.println("슈퍼클래스의 finalMethod()");
		
	}
	
	public void normalMethod() {
		
		System.out.println("슈퍼클래스의 normalMethod()");
		
	}
	
}

class subFinalMethod extends FinalMethod {

	@Override
	public void normalMethod() {

		System.out.println("서브클래스에서 오버라이딩 된 normalMethod()");
		
		finalMethod();
	
	}
	
}

final class FinalClass {
	
	int num = 10;
	
	public void method() {
		
		System.out.println("슈퍼클래스의 method()");
		
	}
	
}

class subFinalClass {
	
	FinalClass fc = new FinalClass();
	
}

//class SubString extends String {
//	
//}
//
//class SubMath extends Math {
//	
//}
>>>>>>> 2e779ec8b031d986791e4219c0909ce2dc765d41

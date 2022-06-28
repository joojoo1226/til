
public class Ex {

	public static void main(String[] args) {

//		AbstractClass ac = new AbstractClass();
		
		
		
	}

}

abstract class AbstractClass {
	
	public abstract void abstractMethod();
	
	public void normalMethod() {
		
	}
	
	public AbstractClass() {
		
	}
	
	String member;
	
}

class SubClass extends AbstractClass {
	
	@Override
	public void abstractMethod() {
		System.out.println("서브클래스에서 오버라이딩(구현)된 추상메서드!");
	}
	
	public void subClassMethod() {
		System.out.println("서브클래스에서 정의한 메서드!");
	}
	
}

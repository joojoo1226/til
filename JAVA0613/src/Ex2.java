
public class Ex2 {

	public static void main(String[] args) {

		
		
	}

}

abstract class AbstractClass2 {
	
	public abstract void method1();
	public abstract void method2();
	
}

class MiddleClass extends AbstractClass2 {

	@Override
	public void method1() {
		System.out.println("MiddleClass에서 구현한 method1()");
	}
	
	@Override
	public void method2() {
		System.out.println("MiddleClass에서 구현한 method2()");
	}
	
}




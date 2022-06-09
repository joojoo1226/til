
public class Ex {

	public static void main(String args[]) {
		
		Child c = new Child();
		
		System.out.println("우리집 TV : " + c.tv);
		
		c.watchTv();
		c.watchParentTv();
		
	}
	
}

class Parent {
	
	String tv = "부모님이 구입한 TV";
	
	public void watchTv() {
		
		System.out.println("부모님 집에서 " + tv + "보기!");
		
	}
	
}

class Child extends Parent {
	
	String tv = "내가 구입한 TV";

	@Override
	public void watchTv() {

		System.out.println("서브클래스에서 오버라이딩 된 watchTv() 메서드");
		System.out.println("독립한 나의 집에서 " + tv + "보기!");
		
	}
	
	public void watchParentTv() {
		
		System.out.println("부모님댁 TV : " + super.tv);
		System.out.println("우리집 TV : " + this.tv);
	
		super.watchTv();
		
	}
	
}

class ParentClass {
	
	String x = "Parent";
	
}

class ChildClass extends ParentClass {
	
	String x = "Child";
	
	public void method() {
		
		String x = "method";
		
		System.out.println("x = " + x);
		
		System.out.println("this.x = " + this.x);
		
		System.out.println("super.x = " + super.x);
		
	}
	
}

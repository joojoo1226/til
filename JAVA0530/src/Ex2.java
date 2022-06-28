
public class Ex2 {

	public static void main(String[] args) {

		Child c = new Child();
		
		c.childPrn();
		c.parentPrn();
		
	}

}

class Parent {
	
	public void ParentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
	
	public Object parentPrn2() {
		
		System.out.println("슈퍼클래스의 parentPrn2()");
		
		return null;
	}
	
	public String parentPrn3() {
		
		System.out.println("슈퍼클래스의 parentPrn3()");
		
		return null;
		
	}
	
}

class Child extends Parent {
	
	public void childPrn() {
		
		System.out.println("서브클래스의 childPrn()");
		
	}

	public void parentPrn() {
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn()");
		
	}
	
	public String parentPrn2() {
		
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn2()");
		
		return null;
		
	}

	@Override
	public String parentPrn3() {
		
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn3()");
		
		return null;
		
	}
	
//	public Object parentPrn3() {
//		
//	}
	
	
	
}

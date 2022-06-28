
public class Ex3 {

	public static void main(String[] args) {

		Parent3 p = new Parent3();
		
		p.parentPrn();
		
		Child3 c = new Child3();
		
		c.childPrn();
		c.parentPrn();
		
		System.out.println("================================================");
		
		p = c;
		
		p.parentPrn();
		
	}

}

class Parent3 {
	
	public void parentPrn() {
		
		System.out.println("슈퍼클래스의 parentPrn()");
		
	}
	
}

class Child3 extends Parent3 {
	
	public void childPrn() {
		
		System.out.println("서브클래스의 childPrn()");
		
	}
	
	@Override
	public void parentPrn() {
		
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn()");
		
	}
	
}

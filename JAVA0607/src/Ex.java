<<<<<<< HEAD

public class Ex {

	public static void main(String[] args) {
		
//		Parent p = new Parent();
		
//		p.parentPrn();
		
		System.out.println("============================");
		
		Child c = new Child();
		
		c.childPrn();
		c.parentPrn();
		
		System.out.println("=============================");
		
		byte bNum = 10;
		int iNum = bNum;

		Parent p;
		
		p = c;
		
	}
	
}

class Parent {
	
	public void parentPrn() {
		
		System.out.println("슈퍼클래스의 parentPrn()");
		
	}
	
}

class Child extends Parent {
	
	public void childPrn() {
		
		System.out.println("서브클래스의 childPrn()");
		
	}
	
}
=======

public class Ex {

	public static void main(String[] args) {
		
//		Parent p = new Parent();
		
//		p.parentPrn();
		
		System.out.println("============================");
		
		Child c = new Child();
		
		c.childPrn();
		c.parentPrn();
		
		System.out.println("=============================");
		
		byte bNum = 10;
		int iNum = bNum;

		Parent p;
		
		p = c;
		
	}
	
}

class Parent {
	
	public void parentPrn() {
		
		System.out.println("슈퍼클래스의 parentPrn()");
		
	}
	
}

class Child extends Parent {
	
	public void childPrn() {
		
		System.out.println("서브클래스의 childPrn()");
		
	}
	
}
>>>>>>> 2e779ec8b031d986791e4219c0909ce2dc765d41

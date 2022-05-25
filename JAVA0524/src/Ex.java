//Inheritance(상속)

public class Ex {

	public static void main(String[] args) {

		Child c = new Child();
		
		c.childPrn();
		c.num = 10;
		c.parentPrn();
		c.showNum();
		
		System.out.println("====================================");
		
		Papa p = new Papa();
		
		System.out.println("Car of papa : " + p.car);
		
		p.singing();
		
		System.out.println("house of papa : " + p.house);
		
		p.drawing();
		
		System.out.println("=====================================");
		
		Me m = new Me();
		
		System.out.println("my phone : " + m.phone);
		
		m.programming();
		
		System.out.println("my car : " + m.car);
		
		m.singing();
		
		System.out.println("my house : " + m.house);
		
		m.drawing();
		
	}

}

class Parent {
	
	int num;
	
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
	
}

class Child extends Parent {
	
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
	
	public void showNum() {
		System.out.println("부모로부터 상속받은 멤버변수 num = " + num);
	}
	
}

class GrandFather {
	
	String house = "highApt";
	String tv = "new tv";
	
	public void drawing() {
		System.out.println("Good at Painting");
	}
	
}

class Papa extends GrandFather{
	
	String car = "sportsCar";
	
	public void singing() {
		System.out.println("Good at Singing");
	}
	
}

class Me extends Papa {
	
	String phone = "smartPhone";
	
	public void programming() {
		System.out.println("Good at programming");
	}
}

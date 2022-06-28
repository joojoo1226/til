package object_class;

public class Ex {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동", "901010-1234567");
		Person p2 = new Person("홍길동", "901010-1234567");
		
		System.out.println("p1의 객체 정보 : " + p1);
		System.out.println("p2의 객체 정보 : " + p2);
		
		if(p1 == p2) {
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		if(p1.equals(p2)) {
			System.out.println("두 객체의 주소값이 같다! (equals())");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (equals())");
		}
		
		System.out.println("=================================================");
		
		Person p3 = p2;
		
		System.out.println("p2의 객체 정보 : " + p2);
		System.out.println("p3의 객체 정보 : " + p3);
		
		if(p3 == p2) {
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		if(p3.equals(p2)) {
			System.out.println("두 객체의 주소값이 같다! (equals())");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (equals())");
		}
		
		System.out.println("================================================");
		
		OverridePerson p10 = new OverridePerson("홍길동", "901010-1234567");
		OverridePerson p11 = new OverridePerson("홍길동", "901010-1234567");
		
		System.out.println("p10의 객체 정보 : " + p10);
		System.out.println("p11의 객체 정보 : " + p11);
		
		if(p10 == p11) {
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		if(p10.equals(p11)) {
			System.out.println("두 객체의 내용(멤버변수 값)이 같다! (equals())");
		} else {
			System.out.println("두 객체의 내용(멤버변수 값)이 다르다! (equals())");
		}
		
	}

}

class Person {
	
	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		
		super();
		this.name = name;
	
	}
	
}

class OverridePerson {
	
	String name;
	String jumin;
	
	public OverridePerson(String name, String jumin) {
		
		super();
		this.name = name;
		this.jumin = jumin;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof OverridePerson) {
			OverridePerson p = (OverridePerson)obj;
			
			if(name.equals(p.name) && jumin.equals(p.jumin)) {
				return true;
			}
		}
		return false;
	}
	
}


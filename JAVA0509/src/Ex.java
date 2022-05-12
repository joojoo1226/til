
public class Ex {

	public static void main(String[] args) {

		System.out.println("Person 인스턴스 생성 전");
		
		Person p = new Person();
		
		System.out.println("Person 인스턴스 생성 후");
		
//		p.name = "홍길동";
//		p.age = 20;
		
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		
		System.out.println("==================================================");
		
		Person p2 = new Person();
		
		p2.name = "이순신";
		p2.age = 40;
		
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
		
	}

}

class Person {
	
	String name;
	int age;
	
//	public Person() {
//		
//		System.out.println("생성자 Person 호출됨!");
//		
//	}
	
	public Person() {
	
		System.out.println("생성자 Person() 호출됨!");
		
		name = "홍길동";
		age = 20;
		
	}
	
}
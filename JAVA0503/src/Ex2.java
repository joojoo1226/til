
public class Ex2 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.name = "홍길동";
		p1.age = 20;
		
		p1.print();
		
		System.out.println("========================================");
		
		Person p2 = new Person();
		
		p2.name = "이순신";
		p2.age = 40;
		
		p2.print();
		
	}
}

class Person {
	
	String name;
	int age;
	
	public void print() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
	
}
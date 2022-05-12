
public class Ex2 {

	public static void main(String[] args) {
	
		Person2 p = new Person2("홍길동", 20);
		p.showInfo();
		
		System.out.println("==========================================");
		
		Person2 p2 = new Person2("이순신", 40);
		p2.showInfo();
		
	}
	
}

class Person2 {
	
	String nation;
	String name;
	int age;
	
	public Person2(String nation, String name, int age) {
		this.nation = nation;
		this.name = name;
		this.age = age;
	}

	
	
	public Person2(String newName, int newAge) {
		
		System.out.println("Person2(String, int) 생성자 호출됨!");
		
		name = newName;
		age = newAge;
		
		nation = "대한민국";
		
	}
	
	public void showInfo() {
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("nation : " + nation);
		
	}
	
}
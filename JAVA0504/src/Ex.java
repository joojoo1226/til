
public class Ex {

	public static void main(String[] args) {

		Person p = new Person();
		
		p.name = "홍길동";
		p.age = 20;
		
		System.out.println("======================");
		
		Person2 p2 = new Person2();
		
//		p2.name = "이순신";
//		p2.age = 40;
		
		p2.setName("이순신");
		p2.setAge(40);
		
//		System.out.println("이름 : " + p2.name);
//		System.out.println("나이 : " + p2.age);
		System.out.println("이름 : " + p2.getName());
		System.out.println("나이 : " + p2.getAge());
		
	}

}


class Person {
	
	String name;
	int age;
	
}

class Person2 {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
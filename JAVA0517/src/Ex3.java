
public class Ex3 {

	public static void main(String[] args) {

		Person p = new Person("박짱구", 20);
		
		p.showPersonInfo();
		
		System.out.println("===========================================================");
		
		p.setName("박댕댕");
		p.setAge(7);
		p.showPersonInfo();
		
		
	}

}


class Person {
	
	private String name;
	private int age;
	
	//기본생성자
	public Person() {
		
	}
	
	//파라미터 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
//		name = name;
		
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
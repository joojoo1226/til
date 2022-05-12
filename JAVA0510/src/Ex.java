
public class Ex {

	public static void main(String[] args) {

//		Person p = new Person();
		
		Person p = new Person("한국", "홍길동", "901010-1234567");
		
		p.showPersonInfo();
		
		System.out.println("====================================================");
		
		Person p2 = new Person("홍길동", "901010-1234567");
		p2.showPersonInfo();
		
		System.out.println("====================================================");
		
		Person p3 = new Person();
		p3.showPersonInfo();
		
		
	}

}


class Person {
	
	String nation;
	String name;
	String jumin;

	public Person() {
		System.out.println("Person() 생성자 호출됨!");
	}
	
	public Person(String newName, String newJumin) {

		System.out.println("Person(String, String) 생성자 호출됨!");
		
		nation = "대한민국";
		
		name = newName;
		jumin = newJumin;
		
	}
	
	public Person(String newNation, String newName, String newJumin) {
		
		System.out.println("Person(String, String, String) 생성자 호출됨!");
		
		nation = newNation;
		name = newName;
		jumin = newJumin;
		
	}
	
	public void showPersonInfo() {
		System.out.println("국가명 : " + nation);
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + jumin);
	}
	
}

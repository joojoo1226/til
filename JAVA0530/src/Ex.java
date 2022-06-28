
public class Ex {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.name = "홍길동";
		
		Student s2 = new Student("이순신", 44, false, true);
		
		s2.eat();
		s2.sleep();
		s2.study();
		
	}

}

class Person {
	
	String name;
	int age;
	boolean isHungry;
	
	public Person() {
		System.out.println("Person() 생성자 호출됨");
	}
	
	public void eat() {
		System.out.println("밥먹기!");
	}
	
	public void sleep() {
		System.out.println("잠자기!");
	}
	
}

class Student extends Person {
	
	boolean isStudyMode;
	
	public Student() {
		System.out.println("Student() 생성자 호출됨!");
	}

	public Student(String name, int age, boolean isHungry, boolean isStudyMode) {
		
		System.out.println("Student(String, int, boolean, boolean) 생성자 호출됨");
		
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
		this.isStudyMode = isStudyMode;
		
	}
	
	public void study() {
		System.out.println("공부하기!");
	}
}
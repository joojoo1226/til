
public class Ex2 {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.isStudyMode);
		
	}
	
}

class Person {
	
	String name;
	int age;
		
	public Person() {
		
	}
	
	public Person(String name, int age) {
		
		super();
		this.name = name;
		this.age = age;
		
		System.out.println("Person(String, int) 생성자 호출됨!");
		
	}
	
}

class Student extends Person {
	
	boolean isStudyMode;
	
	public Student() {
		
//		super("홍길동", 16);
//		
//		isStudyMode = true;
		
		this("홍길동", 16, true);
		
		System.out.println("Student() 생성자 호출됨!");
		
	}
	
	public Student(String name, int age, boolean isStudyMode) {
		
//		this.name = name;
//		this.age = age;
//		this.isStudyMode = isStudyMode;
		
		super(name, age);
		
		this.isStudyMode = isStudyMode;
		
	}
	
}

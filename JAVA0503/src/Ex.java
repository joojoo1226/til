
public class Ex {

	public static void main(String[] args) {

		Animal ani = new Animal();
		
//		System.out.println(ani);
		
		ani.name = "멍멍이";
		System.out.println("이름 : " + ani.name);
		
		ani.age = 3;
		System.out.println("나이 : " + ani.age);
		
		ani.cry();
		
		System.out.println("======================================================");
		
		Animal ani2 = new Animal();
		
		ani2.name = "야옹이";
		ani2.age = 2;
		
		System.out.println("이름 : " + ani2.name + ", 나이 : " + ani2.age);
		
		ani2.cry();
		
		System.out.println("====================================================================================================================");
		
		Car car = new Car();
		
		car.company = "현대";
		car.modelName = "그랜져";
		car.cc = 3000;
		
		car.speedUp();
		car.speedDown();
		
		System.out.println("===================================================================================================================");
		
		Student std = new Student();
		
		std.name = "홍길동";
		std.id = 1;
		std.className = "클라우드 기반 파이썬 네트워크 정보시스템 과정";
		
		System.out.println("이름 : " + std.name);
		System.out.println("번호 : " + std.id);
		System.out.println("과정명 : " + std.className);
		
		std.study("JSP");
		std.rest();
		
		System.out.println("==========================================================================================================================");
		
		Student std2 = new Student();
		
		std2.name = "박송주";
		std2.id = 16;
		std2.className = "JAVA";
		
		System.out.println("이름 : " + std2.name);
		System.out.println("번호 : " + std2.id);
		System.out.println("과정명 : " + std2.className);
		
		std2.study("JSP");
		std2.rest();
	}

}

class Student {
	String name;
	int id;
	String className;
	
	public void study(String subjectName) {
		
		System.out.println(subjectName + " 과목 공부!");
		
	}
	
	public void rest() {
		
		System.out.println("휴식!");
		
	}
	
}


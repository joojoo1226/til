
public class Ex4 {

	public static void main(String[] args) {

		Manager4 m = new Manager4();
		
		System.out.println("===============================================================");
		
//		Manager4 m2 = new Manager4("hong", 4000);
		Manager4 m2 = new Manager4("zzanggu", 4000, "develop");
		
	}

}

class Employee4 {
	
	String name;
	int salary;
	
	public Employee4() {
		
		System.out.println("Call Employee4()");
		
	}
	
	public Employee4(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}


class Manager4 extends Employee4 {
	
	String depart;
	
	public Manager4() {
		
		super();
		
		System.out.println("Call manager4()");
		
	}

	public Manager4(String name, int salary, String depart) {
		
		System.out.println("Call Manager4(String, int, String)");
		
		this.name = name;
		this.salary = salary;
		this.depart = depart;
		
	}
	
}
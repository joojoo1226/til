
public class Test2 {

	public static void main(String[] args) {
		
		Employee em = new Employee();
		Manager man = new Manager();
		
		em.name = "a";
		em.salary = 100;
		
		man.name = "b";
		man.salary = 300;
		man.depart = "develop";
		
		String info1 = em.getEmployee();
		String info2 = man.getManager();
		
		System.out.println(info1);
		System.out.println(info2);
		
	}
}

class Employee {
	
	String name;
	int salary;
	
	public String getEmployee() {
		
//		String info;
		
//		info = name + " " + salary;
		
		return name + ", " + salary;
		
	}
	
}

class Manager extends Employee {
	
	String depart;
	
	public String getManager() {
		
//		String info;
		
//		info = name + " " + salary + " " + depart;
		
		return getEmployee() + ", " + depart;
		
	}
	
	
	
}


public class Ex2 {

	public static void main(String[] args) {

		Employee emp = new Employee("홍길동", 3000);
		
		System.out.println("Employee 정보 : " + emp.getEmployee());
		
		emp.salaryCalculation();
		
		Manager man = new Manager("이순신", 4000,  "개발팀", 3);
		
		System.out.println("Manager 정보 : " + man.getManager());
		
		man.salaryCalculation();
		
		Engineer eng = new Engineer("강감찬", 5000, 5);
		
		System.out.println("Engineer 정보 : " + eng.getEmployee());
		
		eng.salaryCalculation();
		
		System.out.println("===============================================");
		
		Employee emp2 = new Manager("이순신", 4000,  "개발팀", 3);
		
		System.out.println("Employee 정보 : " + emp2.getEmployee());
		
		emp2.salaryCalculation();
		
		System.out.println("==================================================");
	
		emp.salaryCalculationAll(emp);
		man.salaryCalculationAll(man);
		eng.salaryCalculationAll(eng);
		
	}

}

class Employee {
	
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		
		super();
		this.name = name;
		this.salary = salary;
		
	}
	
	public String getEmployee() {
		
		return name + ", " + salary;
		
	}
	
	public void salaryCalculation() {
		
		System.out.println("연봉 : " + salary);
		
	}
	
	public void salaryCalculationAll(Employee emp) {
		
		int salaryResult = 0;
		
		if(emp instanceof Manager) {
			System.out.println("Employee -> Manager 로 다운캐스팅!");
			
//			Manager man = emp;
			Manager man = (Manager)emp;
			
			salaryResult = man.salary + man.manageEmployeeCount * 10;
			
		} else if(emp instanceof Engineer) {
			
			System.out.println("Employee -> Engineer 로 다운캐스팅!");
			
			Engineer eng = (Engineer) emp;
			
			salaryResult = eng.salary + eng.numOfCertificate * 20;
			
		} else if(emp instanceof Employee) {
			
			System.out.println("Employee 그대로 사용!");
			
			salaryResult = salary;
			
		}
		
		System.out.println();
		
	}
	
}

class Manager extends Employee {
	
	String depart;
	int manageEmployeeCount;
	
	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		
		super(name, salary);
		this.depart = depart;
		this.manageEmployeeCount = manageEmployeeCount;
		
	}
	
	public String getManager() {
		
//		return name + ", " + salary + ", " + depart + ", " + manageEmployeeCount + "명";
		return getEmployee() + depart + ", " + manageEmployeeCount + "명";
		
	}
	
	@Override
	public void salaryCalculation() {
		
		int salaryResult = salary + manageEmployeeCount * 10;
		
		System.out.println("Manager 연봉 : " + salaryResult);
		
	}
	
}

class Engineer extends Employee {
	
	int numOfCertificate;

	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary);
		this.numOfCertificate = numOfCertificate;
	}
	
	public String getEngineer() {
		
		return getEmployee() + ", " + numOfCertificate + "개";
		
	}

	@Override
	public void salaryCalculation() {
		
		int salaryResult = salary + numOfCertificate * 20;
		
		System.out.println("엔지니어 연봉 : " + salaryResult);
		
	}
	
}

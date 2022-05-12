//overloading

public class Ex3 {

	public static void main(String[] args) {

		NormalMethod nm = new NormalMethod();
		
		nm.add(10, 20);
		nm.addDouble(1.0, 3.14);
		
		System.out.println("===============================================");
		
		OverloadingMethod om = new OverloadingMethod();
		
		om.add(10, 20);
		om.add(1.5, 3.14);
		om.add(10, 3.14);
		om.add(10, 20, 30);
		
	}

}

//개수가 다르거나 타입이 다르거나
class OverloadingMethod {
	 
	public void add(int num1, int num2) {
		
		System.out.println("add(int, int) 호출됨!");
		
		System.out.println(num1 + num2);
		
	}
	
	public void add(double num1, double num2) {
		
		System.out.println("add(double, double) 호출됨!");
		
		System.out.println(num1 + num2);
		
	}
	
	public void add(int num1, int num2, int num3) {
		
		System.out.println("add(int, int, int) 호출됨!");
		
		System.out.println(num1 + num2 + num3);
		
	}
	
}

class NormalMethod {
	
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void addDouble(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	public void printInt(int num) {
		System.out.println(num);
	}
	
	public void printString(String str) {
		System.out.println(str);
	}
	
}

public class Test3 {

	public static void main(String[] args) {

//		System.out.println();
		
		PrintOverloading po = new PrintOverloading();
		
		po.print(1);
		po.print(3.14);
		po.print("홍길동");
		po.print();
		
		System.out.println("====================================================");
		
		
		Calculator ca = new Calculator();
		
		ca.cal('+', 10, 20);
		ca.cal('+', 10, 20, 30);
		ca.cal('+', 10, 20, 30, 40);
		
		ca.cal('-', 100, 10);
		ca.cal('-', 100, 10, 20);
		ca.cal('-', 100, 10, 20, 30);
		
	}

}


class Calculator {
	
//	public void add(int n1, int n2) {
//		System.out.println(n1 + n2);
//	}
//	
//	public void add(int n1, int n2, int n3) {
//		System.out.println(n1 + n2 + n3);
//	}
//	
//	public void add(int n1, int n2, int n3, int n4) {
//		System.out.println(n1 + n2 + n3 + n4);
//	}
	
	public void cal(char ca, int n1, int n2) {
		if(ca == '+') {
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		} else if(ca == '-') {
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		} else {
			System.out.println("연산 수행 불가");
		}
	}
	
	public void cal(char ca, int n1, int n2, int n3) {
		if(ca == '+') {
			System.out.println(n1 + " + " + n2 + " + " + n3  + " = " + (n1 + n2 + n3));
		} else if(ca == '-') {
			System.out.println(n1 + " - " + n2 + " - " + n3 + " = " + (n1 - n2 - n3));
		} else {
			System.out.println("연산 수행 불가");
		}
	}
	
	public void cal(char ca, int n1, int n2, int n3, int n4) {
		if(ca == '+') {
			System.out.println(n1 + " + " + n2 + " + " + n3 + " + " + n4 + " = " + (n1 + n2 + n3 + n4));
		} else if(ca == '-') {
			System.out.println(n1 + " - " + n2 + " - " + n3 + " + " + n4 +  " = " + (n1 - n2 - n3 - n4));
		} else {
			System.out.println("연산 수행 불가");
		}
	}
	
}


class PrintOverloading {
	
	public void print(int data) {
		System.out.println(data);
	}
	
	public void print(double data) {
		System.out.println(data);
	}
	
	public void print(String data) {
		System.out.println(data);
	}
	
	public void print() {
		System.out.println("줄바꿈");
	}
	
}
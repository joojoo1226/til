
public class Ex4 {

	public static void main(String[] args) {

		MyDate d1 = new MyDate();
		System.out.println(d1.year + "/" + d1.month + "/" + d1.day);
		System.out.println("===================================================");
		
		MyDate d2 = new MyDate(2022);
		System.out.println(d2.year + "/" + d2.month + "/" + d2.day);
		System.out.println("===================================================");
		
		MyDate d3 = new MyDate(2022, 5);
		System.out.println(d3.year + "/" + d3.month + "/" + d3.day);
		System.out.println("===================================================");
		
		MyDate d4 = new MyDate(2022, 5, 17);
		System.out.println(d4.year + "/" + d4.month + "/" + d4.day);
		System.out.println("===================================================");
		
	}

}

class MyDate {
	
	int year;
	int month;
	int day;
	
	public MyDate() {
		
//		this(1900, 1, 1);
		
		System.out.println("MyDate() 생성자 호출됨!");
		
//		year = 1900;
//		month = 1;
//		day = 1;
		
	}

	public MyDate(int year) {
		
//		this(year, 1, 1);
		
		System.out.println("MyDate(int) 생성자 호출됨!");
		
//		this.year = year;
//		month = 1;
//		day = 1;
	}

	public MyDate(int year, int month) {
		
//		this(year, month, 1);
		
		System.out.println("MyDate(int, int) 생성자 호출됨!");
		
//		this.year = year;
//		this.month = month;
//		day = 1;
	}

	//모든 변수를 전달받아 초기화
	public MyDate(int year, int month, int day) {
		
//		this(year, month, day);
		
		System.out.println("MyDate(int, int, int) 생성자 호출됨!");
		
//		this.year = year;
//		this.month = month;
//		this.day = day;
	}
	
	
}
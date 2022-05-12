
public class Test {

	public static void main(String[] args) {

		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(1999);
		MyDate d3 = new MyDate(1999, 12);
		MyDate d4 = new MyDate(1999, 12, 31);
		
		d1.showDate();
		d2.showDate();
		d3.showDate();
		d4.showDate();
		
	}

}

class MyDate {
	
	int year;
	int month;
	int day;
	
	public MyDate() {
		
		year = 2022;
		month = 5;
		day = 10;
		
	}
	
	public MyDate(int newYear) {
		
		year = newYear;
		month = 5;
		day = 10;
		
	}
	
	public MyDate(int newYear, int newMonth) {
		
		year = newYear;
		month = newMonth;
		day = 30;
		
	}
	
	public MyDate(int newYear, int newMonth, int newDay) {
		
		year = newYear;
		month = newMonth;
		day = newDay;
		
	}
	
	public void showDate() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
	
}
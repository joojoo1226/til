
public class Test {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone();
		
		myPhone.call();
		myPhone.message();
		myPhone.kakaotalk();
		
		Phone momPhone = new Phone();
		
		momPhone.call();
		momPhone.message();

		System.out.println("==============================");
		
		momPhone = myPhone;
		
		momPhone.call();
		momPhone.message();
		
		System.out.println("==============================");
		
		momPhone = new SmartPhone();
		
		myPhone = (SmartPhone)momPhone;
		
	}
	
}

class Call {
	
	public void call() {
		
		System.out.println("전화걸기!");
		
	}
	
}

class Phone extends Call {
	
	public void message() {
		
		System.out.println("문자전송!");
		
	}
	
}

class SmartPhone extends Phone {
	
	public void kakaotalk() {
		
		System.out.println("카톡!");
		
	}
	
}


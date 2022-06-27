<<<<<<< HEAD

public class Ex2 {

	public static void main(String[] args) {

		SmartPhone2 sp = new SmartPhone2("iphone12pro", "010-5245-8398", "apple");
		
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		if(sp instanceof SmartPhone2) {
			
			System.out.println("sp is SmartPhone2");
			
			SmartPhone2 phone = sp;
			
		}
		
		System.out.println("==================================================");
		
		if(sp instanceof HandPhone) {
			
			System.out.println("sp is HandPhone");
			System.out.println("So sp can change HandPhone");
			
			HandPhone hp = sp;
			
			System.out.println("sp include all function of HandPhone");
			System.out.println("So, after upcasting, is possible use function of HandPhone");
			
			hp.call();
			hp.sms();
			
		} else {
			
			System.out.println("sp isn't HandPhone");
			
		}
		
		System.out.println("=================================================");
		
		HandPhone hp = new HandPhone("anycall", "011-123-4567");
		
		if(hp instanceof SmartPhone2) {
			
			System.out.println("hp is SmartPhone");
			
		} else {
			
			System.out.println("hp isn't changed to SmartPhone");
			System.out.println("So it can't change SmartPhone");
			System.out.println("hp doesn't include function of SmartPhone");
			
		}
		
		System.out.println("hello");
		
		System.out.println("==================================================");
		
		HandPhone hp2 = new SmartPhone2("iphone12pro", "010-5245-8398", "apple");
		
		hp2.call();
		hp2.sms();
		
		if(hp2 instanceof SmartPhone2) {
			
		}
		
		System.out.println("================================================");
		
		Child c = new Child();
		
		if(c instanceof Parent) {
			
			Parent p = new Parent();
			
			p = c;
			
			p.parentPrn();
			
		} else {
			
			System.out.println("c isn't Parent");
			
		}
		
		Parent p2 = new Parent();
		Child c2 = new Child();
		
		if (p2 instanceof Child) {
			
			c2 = (Child)p2;
			
		} else {
			
			System.out.println("p2 isn't Child");
			
		}
		
	}

}

class HandPhone {
	
	String modelName;
	String phoneNumber;
	
	public HandPhone(String modelName, String phoneNumber) {
		
		super();
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
		
	}
	
	public void call() {
		
		System.out.println("전화 기능!");
		
	}
	
	public void sms() {
		
		System.out.println("문자 기능!");
		
	}

}

class SmartPhone2 extends HandPhone {
	
	String osName;

	public SmartPhone2(String modelName, String phoneNumber, String osName) {
		super(modelName, phoneNumber);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		
		System.out.println("카톡 기능!");
		
	}
	
}
=======

public class Ex2 {

	public static void main(String[] args) {

		SmartPhone2 sp = new SmartPhone2("iphone12pro", "010-5245-8398", "apple");
		
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		if(sp instanceof SmartPhone2) {
			
			System.out.println("sp is SmartPhone2");
			
			SmartPhone2 phone = sp;
			
		}
		
		System.out.println("==================================================");
		
		if(sp instanceof HandPhone) {
			
			System.out.println("sp is HandPhone");
			System.out.println("So sp can change HandPhone");
			
			HandPhone hp = sp;
			
			System.out.println("sp include all function of HandPhone");
			System.out.println("So, after upcasting, is possible use function of HandPhone");
			
			hp.call();
			hp.sms();
			
		} else {
			
			System.out.println("sp isn't HandPhone");
			
		}
		
		System.out.println("=================================================");
		
		HandPhone hp = new HandPhone("anycall", "011-123-4567");
		
		if(hp instanceof SmartPhone2) {
			
			System.out.println("hp is SmartPhone");
			
		} else {
			
			System.out.println("hp isn't changed to SmartPhone");
			System.out.println("So it can't change SmartPhone");
			System.out.println("hp doesn't include function of SmartPhone");
			
		}
		
		System.out.println("hello");
		
		System.out.println("==================================================");
		
		HandPhone hp2 = new SmartPhone2("iphone12pro", "010-5245-8398", "apple");
		
		hp2.call();
		hp2.sms();
		
		if(hp2 instanceof SmartPhone2) {
			
		}
		
		System.out.println("================================================");
		
		Child c = new Child();
		
		if(c instanceof Parent) {
			
			Parent p = new Parent();
			
			p = c;
			
			p.parentPrn();
			
		} else {
			
			System.out.println("c isn't Parent");
			
		}
		
		Parent p2 = new Parent();
		Child c2 = new Child();
		
		if (p2 instanceof Child) {
			
			c2 = (Child)p2;
			
		} else {
			
			System.out.println("p2 isn't Child");
			
		}
		
	}

}

class HandPhone {
	
	String modelName;
	String phoneNumber;
	
	public HandPhone(String modelName, String phoneNumber) {
		
		super();
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
		
	}
	
	public void call() {
		
		System.out.println("전화 기능!");
		
	}
	
	public void sms() {
		
		System.out.println("문자 기능!");
		
	}

}

class SmartPhone2 extends HandPhone {
	
	String osName;

	public SmartPhone2(String modelName, String phoneNumber, String osName) {
		super(modelName, phoneNumber);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		
		System.out.println("카톡 기능!");
		
	}
	
}
>>>>>>> 2e779ec8b031d986791e4219c0909ce2dc765d41

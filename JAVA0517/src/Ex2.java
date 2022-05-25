
public class Ex2 {

	public static void main(String[] args) {

		Money m = new Money();
		PassByTest pbt = new PassByTest();
		
		System.out.println("changePrimitiveType() 메서드 호출 전 money = " + m.money);
		
		pbt.changePrimitiveType(m.money);
		
		System.out.println("changePrimitiveType() 메서드 호출 후 money = " + m.money);
		
		System.out.println("=============================================================");
		
		System.out.println("changePrimitiveType() 메서드 호출 전 money = " + m.money);
		
		pbt.changeReferenceType(m);
		
		System.out.println("changePrimitiveType() 메서드 호출 후 money = " + m.money);
	}

}

class PassByTest {
	
	public void changePrimitiveType(int money) {
		money -= 5000;
		System.out.println("changePrimitiveType() 메서드의 money = " + money);
	}
	
	public void changeReferenceType(Money m) {
		m.money -= 5000;
		System.out.println("changeReferenceType() 메서드의 money = " + m.money);
	}

}

class Money {
	
	int money = 10000;
	
}

public class Test {

	public static void main(String[] args) {

		Account acc = new Account();
		
		System.out.println(acc.accountNo);
		System.out.println(acc.ownerName);
		System.out.println(acc.balance + "원");
		
	}

}

class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 10000;
		
	}
	
	
}
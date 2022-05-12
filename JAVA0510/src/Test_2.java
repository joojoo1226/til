
public class Test_2 {

	public static void main(String[] args) {

		Account acc = new Account("111-1111-111", "홍길동", 0);
		
		acc.showAccountInfo();
		
		System.out.println("============================================");
		
		Account acc2 = new Account("", "", 0);
		
		acc2.showAccountInfo();
		
		System.out.println("============================================");
		
		Account acc3 = new Account("999-9999-999", "이순신");
		
		acc3.showAccountInfo();
		
	}

}


class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
		
	}
	
	public Account(String newAccountNo) {
		
		accountNo = newAccountNo;
		ownerName = "홍길동";
		balance = 0;
		
	}
	
	public Account(String newAccountNo, String newOwnerName) {
		
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = 0;
		
	}
	
	public Account(String newAccountNo, String newOwnerName, int newBalance) {
		
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = newBalance;
		
	}
	
	public void showAccountInfo() {
		
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
		
	}
}
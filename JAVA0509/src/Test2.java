
public class Test2 {

	public static void main(String[] args) {

		Account2 acc = new Account2("111-1111-111", "홍길동", 10000);
		
		acc.showAccountInfo();
		
		System.out.println("=================================================");
		
		Account2 acc2 = new Account2("555-5555-555", "이순신", 99999);
		
		acc2.showAccountInfo();
		
	}

}

class Account2 {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account2(String accountNo, String ownerName, int balance) {

		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		
	}

	public void showAccountInfo() {
		
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		
	}
	
}
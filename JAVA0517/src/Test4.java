
public class Test4 {
	
	public static void main(String[] args) {
		
		Account1 acc = new Account1();
		
		acc.showAccountInfo();
		
	}

}

class Account1 {
	
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account1() {
		accountNo = "111-1111-111";
		ownerName = "박짱구";
		balance = 1000000; 
	}
	
	public Account1(String accountNo) {
		
		this.accountNo = accountNo;
		
	}

	public Account1(String accountNo, String ownerName) {
		
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		
	}

	public Account1(String accountNo, String ownerName, int balance) {
		
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
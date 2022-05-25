package static_member;

public class Test4 {

	public static void main(String[] args) {

//		Account acc = new Account();
		
		Account acc = Account.getInstance();
		
		acc.setAccountNo("111-1111-111");
		
		acc.showAccountInfo();
		
	}

}

class Account {
	
	private String accountNo;
	private String ownerName;
	private int balance;
	
	private Account() {
		
	}

	private static Account instance = new Account();
	
	public static Account getInstance() {
		
		return instance;
		
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void showAccountInfo() {
		
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("사람이름 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		
	}
	
}
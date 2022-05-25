
public class Test3 {

	public static void main(String[] args) {

		Account acc = new Account("111-1111-111", "o(*°▽°*)o", 100000);
		
		acc.showAccountInfo();
	}

}

class Account {
	
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account(String acc, String name, int money) {
		this.accountNo = acc;
		this.ownerName = name;
		this.balance = money;
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
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
}
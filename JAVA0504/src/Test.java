
public class Test {

	public static void main(String[] args) {

		Account2 acc = new Account2();
		
		acc.setAccountNo("112-2140-7867-07");
		acc.setOwnerName("박송주");
		acc.setBalance(10000);
		
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재 잔고 : " + acc.getBalance());
	
	}

}


class Account2 {
	
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
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
	
	
	
}
package object_class;

public class Test2 {

	public static void main(String[] args) {

		Account acc = new Account("111-1111-111", "hong", 10000);
		Account acc2 = new Account("111-1111-111", "hong", 10000);
		
		if(acc.equals(acc2)) {
			System.out.println("두 계좌는 동일한 계좌입니다!");
		} else {
			System.out.println("두 계좌는 다른 계좌입니다!");
		}
		
		System.out.println("acc의 계좌정보 : " + acc);
		
	}

}

class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
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
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}

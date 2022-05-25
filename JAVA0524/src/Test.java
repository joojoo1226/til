
public class Test {

	public static void main(String[] args) {

		Account acc = new Account();
		ItwillBank it = new ItwillBank();
		
		acc.accountNo = "111-1111-111";
		acc.ownerName = "a";
		acc.balance = 10000;
		it.accountNo = "222-2222-222";
		it.ownerName = "b";
		it.balance = 10000;
		
		acc.deposit(50000);
		acc.withdraw(10000);
		acc.showAccountInfo();
//		acc.contract("samsung");
		
		System.out.println("=========================================");
		
		it.deposit(100000);
		it.withdraw(50000);
		it.showAccountInfo();
		it.contract("samsung");
		
	}

}

class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public void deposit(int amount) {
		
		balance += amount;
		
		
	}
	
	public int withdraw(int amount) {
		
		if(balance>amount) {
			balance -= amount;
		} else {
			System.out.println("don't have money");
		}
		
		return balance;
		
	}
	
	public void showAccountInfo() {
		
		System.out.println("acc : " + accountNo);
		System.out.println("owner : " + ownerName);
		System.out.println("money : " + balance);
		
	}

}

class ItwillBank extends Account {
	
	String insureName;
	
	public void contract(String insureName2) {
		
		insureName = insureName2;
		
		System.out.println(insureName + " 보험 계약 완료!");
		
	}
	
}

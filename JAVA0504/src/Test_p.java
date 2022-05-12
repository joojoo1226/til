
public class Test_p {

	public static void main(String[] args) {

		Account a = new Account();
		
		a.accountNo = "(부산)112-2140-7867-07";
		a.ownerName = "박송주";
		a.balance = 10000;
		
		a.showAccountInfo();
		a.deposit(10000);
		
		int money = a.withdraw(10000);
		
		System.out.println(money + "원 출금완료!");
		
	}

}


class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		
	}
	
	public void deposit(int amount) {
		
		balance += amount;
		
		System.out.println("입금한 금액 : " + amount);
		System.out.println("입금 후 현재 잔고 : " + balance);
		
	}
	
	public int withdraw(int amount) {
		
		System.out.println("출금할 금액 : " + amount);
		
		if (balance < amount) {
			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
			return 0;
		} else {
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance);
			return amount;
		}
	}
	
}
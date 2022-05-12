
public class Test2 {

	public static void main(String[] args) {

		Account1 acc = new Account1();
		
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		
		acc.showAccountInfo();
		
		System.out.println("============================================================");
		
		Account1 acc2 = new Account1();
		
		acc2.accountNo = "(부산) 112-2140-7867-07";
		acc2.ownerName = "박송주";
		acc2.balance = 90000000000000000L;
		
		acc2.showAccountInfo();
	}

}

class Account1 {
	
	String accountNo;
	String ownerName;
	long balance;
	
	public void showAccountInfo() {
		
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
		
	}
}
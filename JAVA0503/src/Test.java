
public class Test {

	public static void main(String[] args) {

		Account ac = new Account();
		
		ac.accountNo = "111-1111-111";
		ac.ownerName = "홍길동";
		ac.balance = 10000;
		
		System.out.println("계좌번호 : " + ac.accountNo);
		System.out.println("예금주명 : " + ac.ownerName);
		System.out.println("현재잔고 : " + ac.balance + "원");
		
		System.out.println("===============================");
		
		Account acc = new Account();
		
		acc.accountNo = "(부산) 112-2140-7867-07";
		acc.ownerName = "박송주";
		acc.balance = 90000000000000000L;
		
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주명 : " + acc.ownerName);
		System.out.println("현재잔고 : " + acc.balance + "원");
		
	}

}


class Account {
	
	String accountNo;
	String ownerName;
	long balance;
	
}
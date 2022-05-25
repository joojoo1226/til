
public class Ex {

	public static void main(String[] args) {

		NomalArguments na = new NomalArguments();
		
		na.print("홍길동");
		na.print("홍길동", "이순신");
		na.print("홍길동", "이순신", "강감찬");
//		na.print("홍길동", "이순신", "강감찬", "박짱구");
		
		String[] strArr = {"홍길동", "이순신", "강감찬", "박짱구"};
		na.print(strArr);
		
		System.out.println("");
		System.out.println("===========================================================");
		System.out.println("❤🧡💛💚💙💜🤎🖤🤍❣💕💞💓💗💖💘💝💟");
		
		VariableArguments va = new VariableArguments();
		
		va.print("홍길동");
		va.print("홍길동", "이순신");
		va.print("홍길동", "이순신", "강감찬");
		va.print();
		
		va.print2(2, "홍길동", "이순신");
	}

}

class VariableArguments {
	
	public void print(String...names) {
		for (int i=0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();
	}
	
	public void print2(int num, String... names) {
		
	}
}

class NomalArguments {
	
	public void print(String name1) {
		System.out.println(name1);
	}
	
	public void print(String name1, String name2) {
		System.out.println(name1 + ", " + name2);
	}
	
	public void print(String name1, String name2, String name3) {
		System.out.println(name1 + ", " + name2 + ", " + name3);
	}
	
	public void print(String[] names) {
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}
	
}


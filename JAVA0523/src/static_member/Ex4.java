package static_member;

public class Ex4 {

	public static void main(String[] args) {

//		SingletonClass sc = new SingletonClass();
//		SingletonClass sc2 = new SingletonClass();
		
		SingletonClass sc = SingletonClass.getInstance();
		
//		SingletonClass.instance = null;
//		sc.instance = null;
		
		sc.str = "싱글톤 패턴으로 생성한 인스턴스의 str";
		
		SingletonClass sc2 = SingletonClass.getInstance();
		
		System.out.println("sc.str : " + sc.str);
		System.out.println("sc2.str : " + sc2.str);
		
		if(sc == sc2) {
			System.out.println("sc와 sc2는 같은 인스턴스!");
		} else {
			System.out.println("sc와 sc2는 다른 인스턴스!");
		}
		
	}

}

class SingletonClass {
	
	String str;
	
//	public SingletonClass() {
//		
//	}
	
	private SingletonClass() {
		
	}
	
	private static SingletonClass instance = new SingletonClass();
	
	public static SingletonClass getInstance() {
		
		return instance;
		
	}
	
}

class SingletonClass2 {
	
	String str;
	
	private static SingletonClass2 instance = new SingletonClass2();
	
	private SingletonClass2() {
		
	}

	public static SingletonClass2 getInstance() {
		return instance;
	}
	
}


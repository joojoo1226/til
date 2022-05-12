
public class Test2_2 {

	public static void main(String[] args) {
		
		Person1 p1 = new Person1();
		
		p1.name = "박송주";
		p1.age = 26;
		
		p1.showPersonInfo();
		p1.eat("빵");
		p1.talk();
		System.out.println("배고픔 : " + p1.isHungry);
		
	
		
	}

}




class Person1 {
	
	String name;
	int age;
	boolean isHungry;
	
	public void showPersonInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("배고픔 : " + isHungry);
		
	}
	
	public void eat(String foodName) {
		
		System.out.println(foodName + " 먹기!");
		
		isHungry = false;
		
	}
	
	public void talk() {
		
		System.out.println("말하기!");
		
		isHungry = true;
		
	}
}
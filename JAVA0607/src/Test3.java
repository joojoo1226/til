
public class Test3 {

	public static void main(String[] args) {

		Animal animal = new Animal("zzang", 7);
		
		animal.cry();
		
		Dog dog = new Dog("zzanggu", 7);
		
//		dog = (Dog)a;
		
		if(dog instanceof Dog) {
			animal = dog;
		}
		
//		animal = new Dog();
		animal.cry();
		
//		animal = new Cat();
		animal.cry();
		
	}

}

class Animal {
	
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	public void cry() {
		
		System.out.println("동물 울음소리!");
		
	}
	
}

class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void cry() {
		
		System.out.println("멍멍");
		
	}
	
}

class Cat extends Animal {
	
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void cry() {
		
		System.out.println("냐옹!");
		
	}
	
}


public class Ex3 {

	public static void main(String[] args) {

		
		
	}

}

class Engine {
	
	int cc = 3000;
	
}

class Car {
	
	Engine en = new Engine();
	
	String modelName = "Grandeur";
	
	public void showCarInfo() {
		
		System.out.println("modelName : " + modelName);
		System.out.println("cc : " + en.cc);
		
	}
	
}

class FireEngine extends Car {
	
	int supplyLimit = 10000;
	
	public void showFireEngineInfo() {
		
		System.out.println("water : " + supplyLimit);
		System.out.println("modelName : " + modelName);
		System.out.println("cc : " + en.cc);
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		ElectricCar ec = new ElectricCar();
		
		ec.speed = 0;
		ec.maxSpeed = 240;
		ec.betteryCapacity = 5;
		
		ec.speedUp();
		ec.speedDown();
		
	}
	
}

class Car {
	
	int speed;
	int maxSpeed;
	
	public void speedUp() {
		System.out.println("자동차 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("자동차 속도 감소!");
	}
	
	public void addFuel() {
		System.out.println("자동차 연료 주입!");
	}
	
}

class ElectricCar extends Car {
	
	int betteryCapacity;
	
	public void speedUp() {
		System.out.println("EletricCar 전기모터의 힘으로 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("EletricCar 속력 감소하면서 전기배터리 충전!");
	}
	
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
	
}

class DieselCar extends Car {
	
	int cc;
	
	public void speedUp() {
		System.out.println("디젤 엔진의 힘으로 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("디젤 자동차 속력 감소!");
	}
	
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 주입!");
	}
	
}

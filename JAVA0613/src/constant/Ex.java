package constant;

import java.util.Calendar;

public class Ex {

	public static void main(String[] args) {

		CarInfo ci = new CarInfo();
		
		ci.setCompany("hyundai");
		ci.setCarModelName("SONATA");
		ci.setColor(0x000000);
		
		if(ci.getCompany() == "HYUNDAI") {
			System.out.println("현대 자동차입니다.");
		} else {
			System.out.println("현대 자동차가 아닙니다.");
		}
		
		if(ci.getCarModelName() == "SONATA") {
			System.out.println("쏘나타입니다.");
		} else {
			System.out.println("쏘나타가 아닙니다.");
		}
		
		System.out.println("==============================================");
		
		CarInfoWithConstant ci2 = new CarInfoWithConstant();
		
		ci2.setCompany(CarInfoWithConstant.COMPANY_HYUNDAI);
		ci2.setCarModelName(CarInfoWithConstant.CAR_MODEL_NAME_SONATA);
		ci2.setColor(CarInfoWithConstant.COLOR_PERFECT_BLACK);
		
		if(ci2.getCompany() == CarInfoWithConstant.COMPANY_HYUNDAI) {
			System.out.println("현대자동차");
		} else {
			System.out.println("현대자동차 아님");
		}
		
		if(ci2.getCarModelName() == CarInfoWithConstant.CAR_MODEL_NAME_SONATA) {
			System.out.println("쏘나타입니다.");
		} else {
			System.out.println("쏘나타가 아닙니다.");
		}
		
		System.out.println("================================================");
		
		Calendar cal = Calendar.getInstance();
		System.out.println("올해는 몇 년도? " + cal.get(Calendar.YEAR));
		
	}

}

class CarInfoWithConstant {
	
	private String company;
	private String carModelName;
	private int color;
	
	public static final String COMPANY_HYUNDAI = "HYUNDAI";
	public static final String COMPANY_KIA = "KIA";
	public static final String COMPANY_CHEVROLET = "CHEVROLET";
	
	public static final String CAR_MODEL_NAME_SONATA = "SONATA";
	public static final String CAR_MODEL_NAME_K5 = "K5";
	public static final String CAR_MODEL_NAME_SPARK = "SPARK";
	
	public static final int COLOR_PERFECT_BLACK = 0x000001;
	public static final int COLOR_CREAM_WHITE = 0xFFFFCC;
	public static final int COLOR_BARCELONA_RED = 0xFF0000;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
}

class CarInfo {
	
	private String company;
	private String carModelName;
	private int color;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
}

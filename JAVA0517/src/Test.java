
public class Test {

	public static void main(String[] args) {
		
		VariableArgumentsTest vat = new VariableArgumentsTest();
		
		vat.print(10, 20);
		vat.print(1, 2, 3, 4,5 , 6, 7, 8, 9, 10);
		vat.print();
		
		System.out.println("\n===========================================================");
	}
}

class VariableArgumentsTest {
	
	public void print(int...nums) {
		
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println(" ");
	}
	
	public void print() {
		System.out.println("주세여!");
	}
}
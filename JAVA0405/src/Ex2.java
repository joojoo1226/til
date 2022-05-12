
public class Ex2 {

	public static void main(String[] args) {
		
		int intValue = 10;
		char CharValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		byte byteValue = 10;
		
		double var = intValue;
		byte var2 = (byte)intValue;
		int var3 = (int)doubleValue;
//		char var4 = (char)strValue;
		
//		byte result = (int)byteValue + (int)byteValue;
		byte result = (byte)(byteValue + byteValue);
		
		
	}
}

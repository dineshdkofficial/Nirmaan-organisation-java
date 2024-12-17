package day18;

import day10.main;

public class Wrap {
	public static void main(String[]agrs) {
		int num=10;
		byte num1=5;
		boolean value=true;
		char letter=('d');
		double num2=22.00;
		float num3=5.0f;
		short num4=126;
		
		Integer autoBoxingInt=num;
		System.out.println(autoBoxingInt);
		
		int unBoxing = autoBoxingInt;
		System.out.println(unBoxing);
		
		Byte autoBoxingByte=num1;
		System.out.println(autoBoxingByte);
		
		byte unBoxing1 = autoBoxingByte;
		System.out.println(unBoxing1);
		
		Boolean autoBoxingBoolean=value;
		System.out.println(autoBoxingBoolean);
		
		boolean unBoxing2 = autoBoxingBoolean;
		System.out.println(unBoxing2);
		
		Character autoBoxingCharacter=letter;
		System.out.println(autoBoxingCharacter);
		
		char unBoxing3 = autoBoxingCharacter;
		System.out.println(unBoxing3);
		
		Double autoBoxingDouble=num2;
		System.out.println(autoBoxingDouble);
		
		double unBoxing4 = autoBoxingDouble;
		System.out.println(unBoxing4);
		
		Float autoBoxingFloat=num3;
		System.out.println(autoBoxingFloat);
		
		float unBoxing5 = autoBoxingFloat;
		System.out.println(unBoxing5);
		
		Short autoBoxingShort=num4;
		System.out.println(autoBoxingShort);
		
		short unBoxing6 = autoBoxingShort;
		System.out.println(unBoxing6);
		
		
		
	}

}

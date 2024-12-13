package day15;

import java.util.Scanner;

public class main {
	public static void main(String[]agrs) {
		Calculator Calc=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the firstNum ");
		int firstNum=sc.nextInt();
		System.out.println("Enter the secondNum ");
		int secondNum=sc.nextInt();
		
		
		System.out.println("Addition");
		System.out.println(Calc.add(firstNum,secondNum));
		
		System.out.println("Substraction");
		System.out.println(Calc.sub(firstNum,secondNum));
		
		System.out.println("Multiply");
		System.out.println(Calc.mul(firstNum,secondNum));
		
		System.out.println("Division");
		System.out.println(Calc.div(firstNum,secondNum));
	}

}

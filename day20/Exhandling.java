package day20;

import java.util.Scanner;

public class Exhandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age > 0) {
			System.out.println(age);
		}
		else {
			throw new ArithmeticException();
		}}
		catch  (ArithmeticException  age) {
		System.out.println("enter crt age");
		}
		catch (Exception E) {
		System.out.println(E);
		
		}
		finally {
			System.out.println("age crt");
		}

}}

package day5;

import java.util.Scanner;

public class stringcon {
	public static void main(String[]agrs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name= sc.nextLine();
	System.out.println(name);
	System.out.println(name.length());
    System.out.println(name.substring(0,7));
    System.out.println(name.charAt(0));

	}

}




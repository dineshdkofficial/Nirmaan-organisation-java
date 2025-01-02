package day25;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class book {
	public static void main(String[] args) {
		HashSet<Integer>HS=new HashSet<Integer>();
		TreeSet<Integer>hs=new TreeSet<Integer>();
		LinkedHashSet<Integer>sh=new LinkedHashSet<Integer>();
		SetInJava Book=new SetInJava(123,"oop","dinesh",200,2);
		SetInJava Book1=new SetInJava(1456,"oop","dinesh",200,2);
		HS.add(10);
		HS.add(20);
		HS.add(50);
		HS.add(30);
		HS.add(20);
		
		
		hs.add(100);
		hs.add(80);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		
		
		
		sh.add(100);
		sh.add(100);
		sh.add(50);
		sh.add(70);
		sh.add(60);
		
		
		System.out.println(Book.equals(Book1));
		System.out.println(HS);
		System.out.println(hs);
		System.out.println(sh);
		
	}

}

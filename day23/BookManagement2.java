package day23;

import java.util.ArrayList;
import java.util.Scanner;

import day22.Book;

public class BookManagement2 {
	public static void main(String[] args) {
		Book2 book = new Book2();
		Scanner sc = new Scanner(System.in);
		ArrayList<Book2> al = new ArrayList<Book2>();
		
		boolean isTrue = true;
		
		int choice;
		
		while(isTrue) {
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for remove");
			System.out.println("4 for get");
			System.out.println("0 for exit");
			
			System.out.println("\nEnter your choice");
			choice = sc.nextInt();
			
			sc.nextLine();
	
		if(choice == 1) {
			
			System.out.println("Enter the id");
			int id = sc.nextInt();
			
			System.out.println("Enter the bookName");
			String bookName = sc.nextLine();
			
			System.out.println("Enter the author");
			String author = sc.nextLine();
			
			System.out.println("Enter the price");
			double price = sc.nextDouble();
			
			System.out.println("Enter the noofCopies");
			int copies = sc.nextInt();
		
			al.add(book =new Book2(id, bookName, author, price, copies));			
}	

		else if(choice == 2) {
			System.out.println("Enter the id");
			int select  = sc.nextInt();
			boolean isThere = false;
			for(Book2 book1 : al) {
				if(select==book1.getId()) {
					isThere = true;
					System.out.println("Enter the bookName");
			String value = sc.nextLine();
					book.setBookName(value);
				}
				}	
			
			if(!isThere) {
				System.out.println("book not there");
			}
		}
			
			else if(choice == 3) {
				System.out.println("Enter the id");
				int select  = sc.nextInt();
				boolean isThere = false;
				for(Book2 book2 : al) {
					if(select== book2.getId()) {
						isThere = true;
						al.remove(book2);
						System.out.println("id is remove");
						break;
					}	
				}
			
			if(!isThere) {
				System.out.println("not there");
			}
			}	
			else if(choice == 4) {
				System.out.println(al);
			}
			
			
			else if(choice == 0) {
				isTrue = false;
				System.out.println("program end");
			}
			}}
		}





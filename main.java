package day12;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		java.util.Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		Singlebook book=new Singlebook();
		
		while(isTrue) {
			System.out.println();
			System.out.println("1 for add");
			System.out.println("2 for show");
			System.out.println("0 for exit");
			int value=sc.nextInt();
			sc.nextLine();
			switch(value) {
		
			case 1:
			{
				System.out.println("title");
				String title =sc.nextLine();
				book.setTitle(title);
				
				System.out.println(" Author");
				String  Author =sc.nextLine();
				book.setAuthor( Author);
				
				
				System.out.println(" Price");
				double  Price =sc.nextInt();
				book.setPrice( Price);
				

				System.out.println(" Numberofcopies");
				int  Numberofcopies =sc.nextInt();
				book.setNumberofcopies(Numberofcopies);
				break;
			}
		
			case 2:
			{
				System.out.println("title");
				String title =sc.nextLine();
				book.setTitle(title);
				
				System.out.println(" Author");
				String  Author =sc.nextLine();
				book.setAuthor( Author);
				
				
				System.out.println(" Price");
				double  Price =sc.nextInt();
				book.setPrice( Price);
				

				System.out.println(" Numberofcopies");
				int  Numberofcopies =sc.nextInt();
				book.setNumberofcopies(Numberofcopies);
				break;
			
				
			}
			case 3:
			{
				System.out.println(book.toString());
				break;
				}
			case 0:
			{
				isTrue=false;
				System.out.println("Thank you");
				break;
			}
			
		}
	}
}
		}
	



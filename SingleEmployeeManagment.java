package day14;
import java.util.Scanner;
public class SingleEmployeeManagment {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		Employee E=new Employee();
		
		while(isTrue) {
			System.out.println();
			System.out.println("1 for add empdetails");
			System.out.println("2 for show empdetails");
			System.out.println("3 for update empdetails");
			System.out.println("0 for exit");
			int value=sc.nextInt();
			sc.nextLine();
			switch(value) {
			case 1:
			{
				System.out.println("id");
				int id =sc.nextInt();
				sc.nextLine();
				E.setId(id);
				
				System.out.println("empname");
				String empname =sc.nextLine();
				sc.nextLine();
				E.setEmpname(empname);
				
				System.out.println(" phoneNo");
				Long phoneNo =sc.nextLong();
				sc.nextLine();
				E.setPhoneNo( phoneNo);
				
				System.out.println("department");
				String department =sc.nextLine();
				sc.nextLine();
				E.setDepartment(department);
				break;
			}
			case 2:
			{
				System.out.println("id");
				int id =sc.nextInt();
				sc.nextLine();
				E.setId(id);
				
				System.out.println("empname");
				String empname =sc.nextLine();
				sc.nextLine();
				E.setEmpname(empname);
				
				System.out.println(" phoneNo");
				Long phoneNo =sc.nextLong();
				sc.nextLine();
				E.setPhoneNo( phoneNo);
				
				System.out.println("department");
				String department =sc.nextLine();
				sc.nextLine();
				E.setDepartment(department);
				break;
				
			}
			case 3:
			{
				System.out.println(E.toString());
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

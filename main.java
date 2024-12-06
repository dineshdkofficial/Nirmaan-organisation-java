package day11;

public class main {
	public static void main(String[] args) {
	Employee emp =new Employee("Dinesh",22,700219725l,"IT");
			System.out.println(emp.getEmpName());
	System.out.println(emp.getEmpAge());
	System.out.println(emp.getEmpPhoneNo());
	System.out.println(emp.getEmpDepartment());
	
	System.out.println(emp);
	
	Employee emp1 =new Employee();
	emp1.setEmpName("kumar");
	emp1.setEmpAge(20);
	emp1.setEmpPhoneNo(207856963662l);
	emp1.setEmpDepartment("java");
	
	
	
			
	}
}

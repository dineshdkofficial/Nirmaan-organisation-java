package day14;

public class Employee {
	private int id;
	private String empname;
	private long phoneNo;
	private String department;

	public Employee () {

}

	public Employee(int id, String empname, long phoneNo, String department) {
		this.id = id;
		this.empname = empname;
		this.phoneNo = phoneNo;
		this.department = department;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", phoneNo=" + phoneNo + ", department=" + department
				+ "]";
	}

	
 
}
package week2.day4;

public class EmployeeDetails {

	public void printEmployeeName(String empName,int empId) {
		System.out.println("Name = "+empName );
		System.out.println("Id= "+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Address= "+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Salary= "+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("PhoneNumber= "+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.printEmployeeName("HariPrakash", 4006);
		employee.getEmployeeAddress("Chennai");
		employee.printEmployeeSalary(25000.75);
		employee.printEmployeeMobileNumber(8838077003L);
	}
}


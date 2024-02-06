package encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		EmployeeDetails empDetails= new EmployeeDetails();
		empDetails.setEmpId(320);
		empDetails.setEmpName("Vivek");
		empDetails.setEmpSalary(50000);
		empDetails.setEmpDept("Automation testing");
		System.out.println("empId---"+empDetails.getEmpId());
		System.out.println("empName---"+empDetails.getEmpName());
		System.out.println("empSalary---"+empDetails.getEmpSalary());
		System.out.println("empDept---"+empDetails.getEmpDept());
		
	}

}

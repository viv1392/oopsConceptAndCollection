package abstarction;

public class EmployeeDetails implements Bank{

	@Override
	public void employeeId(int x) {
         System.out.println(x);
	}

	@Override
	public void employeeName(String y) {
       System.out.println(y);
	}

	@Override
	public void employeeDepartment(String z) {
		System.out.println(z);
		
	}

}

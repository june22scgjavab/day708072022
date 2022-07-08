
public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee(1,"Ram",45000);
		
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		/*
		 * emp1=null; emp2=null;
		 */

	}

}

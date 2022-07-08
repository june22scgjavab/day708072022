
public class EmployeeMain {

	// If the member is static we should not confuse ourself 
	// with the objects try to access the static member with class name
	// rather than accessing them with object
	
	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		employee1.setId(1);
		employee1.setName("Rohan");
		//employee1.setCompanyName("infosys");
		employee2.setId(2);
		employee2.setName("Juben");
		//employee2.setCompanyName("xyz");
		employee3.setId(3);
		employee3.setName("Nita");
		//employee3.setCompanyName("abc");
		Employee.setCompanyName("Infosys");
       System.out.println(employee1.getId());
       System.out.println(employee1.getName());
      // System.out.println(employee1.getCompanyName());
       System.out.println(employee2.getId());
       System.out.println(employee2.getName());
      // System.out.println(employee2.getCompanyName());
       System.out.println(employee3.getId());
       System.out.println(employee3.getName());
      // System.out.println(employee3.getCompanyName());
	   System.out.println(Employee.getCompanyName());
	}
	

}

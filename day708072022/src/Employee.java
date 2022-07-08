
public class Employee {
private int id;
private String empName;
private long basic;

// partameterless constructor
public Employee() {
	id=1;
	empName="Akash";
	basic=34000;
}

// parameterized constructor
public Employee(int id,String empName,long basic)
{
	this.id=id;
	this.empName=empName;
	this.basic=basic;
}

public void displayEmployeeDetails() {
	System.out.println(id);
	System.out.println(empName);
	System.out.println(basic);
}
}

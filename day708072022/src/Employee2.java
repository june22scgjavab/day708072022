
public class Employee2 {
private int id;
private String empName;
private long basic;

// Constructor chaining 
public Employee2() {
	System.out.println("Hi");
//	this(1,"Ram",3000); // writing this line should be always the first line of the constructor
	// otherwise it is a compilation error
}


public Employee2(int id,String empName,long basic)
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

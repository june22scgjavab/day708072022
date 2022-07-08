
public class Employee {
private int id;   // non-static
private String name;  // non-static
private static String companyName;  // companyName is declared as static
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

// The setter and getter methods related to companyName is static
public static String getCompanyName() {
	return companyName;
}
public static void setCompanyName(String companyName) {
	Employee.companyName = companyName;
}



}

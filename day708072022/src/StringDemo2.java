
public class StringDemo2 {

	public static void main(String[] args) {
	String str1="Welcome";
	// It will be checked that we have Welcome in the string constant pool
	// So in the above case , Welcome is not there in that case in the
	// string pool Welcome is stored
	String str2="Welcome";
	// It will be checked whether we have Welcome in the string pool, yes
	// we have because of line 5
	// So new String literal wont be created and str2 will also point to the same
	// string literal.
	System.out.println(str1==str2);// true
	// == is used to check whether both the reference variables are pointing to the
	// same object or not. In our case str1 and str2 are pointing to the same string literal
   System.out.println(str1.equals(str2)); //true
	// equals will check whether the content is exactly same or not
   String str3=new String("Welcome");
   String str4=new String("Welcome");
   System.out.println(str3==str4); // false
   System.out.println(str3.equals(str4));// true
   
   
   
	}

}

package day708072022String;

public class StringDemo2 {

	public static void main(String[] args) {
	String str1="Hello";
	String str2="World";
	String result=str1+str2;
	System.out.println(result);
	result=str1+" "+str2;
	System.out.println(result);
	result=str1.concat(str2);
	System.out.println(result);
	result=str1.concat(" ");
	System.out.println(result+"|");
	result=result.concat(str2);
	System.out.println(result);
	result=str1.concat(" ").concat(str2);
	System.out.println(result);
	
	}

}

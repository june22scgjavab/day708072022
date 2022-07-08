package day708072022String;

public class StringDemo4 {

	public static void main(String[] args) {
		String str1="Welcome";
		char ch=str1.charAt(0); // the position in string starts from 0
		System.out.println(ch);
		ch=str1.charAt(1);
		System.out.println(ch);
		ch=str1.charAt(16);//  java.lang.StringIndexOutOfBoundsException: String index out of range: 20
		System.out.println(ch);
		
		
	}

}

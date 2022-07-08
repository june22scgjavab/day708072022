package day708072022String;
public class StringExercise1 {
	public static void main(String[] args) {
	   String str="Welcome12";
	   ValidateLength valid=new ValidateLength();
	   if(valid.lengthMoreThan8Character(str))
	   {
		   System.out.println("Valid");
	   }
	   else
	   {
		   System.out.println("Invalid");
	   }

	}

}

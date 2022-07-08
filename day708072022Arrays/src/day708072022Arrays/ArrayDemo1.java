package day708072022Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int num[]=new int[3];
		// int num[];  // It is a single dimensional array
		// num=new int[3]; // with new we are asking to create an array during the runtime
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]); //0
		}
		
		String names[]=new String[5];
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
	}

}

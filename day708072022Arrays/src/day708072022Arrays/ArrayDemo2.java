package day708072022Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int num[]= {1,2,6}; // Array declaration and initialisation in the same step
		System.out.println(num.length);
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("--------------");
		for(int x : num)  // It can be used to set the values of an array
			// can be used to access the data from an array
		{
			System.out.println(x);
		}

	}

}

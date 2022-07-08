package day708072022multidimensionalarray;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int num[][] = new int[3][2]; // 3 rows and 2 columns
		Scanner scan=new Scanner(System.in);
		System.out.println(num.length); // The number of rows
		for (int rows = 0; rows < num.length; rows++) {
			for (int col = 0; col < num[rows].length; col++) {
			System.out.println("Enter the value");
			num[rows][col]=scan.nextInt();
			}
	
		}
		for (int rows = 0; rows < num.length; rows++) {
			for (int col = 0; col < num[rows].length; col++) {
			 System.out.print(num[rows][col]+"\t");
			}
	     System.out.println();
		}

		/* for(int n[] : num)  // double dimensional array to single dimensional array
		{
			for(int x : n)  // single dimensional array to single variable x
			{
				System.out.print(x+"\t");
			}
		  System.out.println();
		} */
		
	}

}

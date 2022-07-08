package day708072022Arrays;

import java.util.Scanner;
// User input in an array
public class ArrayDemo3 {

	public static void main(String[] args) {
		int num[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.println("Enter the number");
			num[i]=scan.nextInt();
		}
		
		for(int n : num) {
			System.out.println(n);
		}

	}

}

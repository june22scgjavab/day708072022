package day708072022Arrays;

import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
		String names[]=new String[5];
        Scanner scan=new Scanner(System.in);
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter the name");
			names[i]=scan.next();
		}
       for(String name : names)
       {
    	   System.out.println(name);
       }
		
	}

}

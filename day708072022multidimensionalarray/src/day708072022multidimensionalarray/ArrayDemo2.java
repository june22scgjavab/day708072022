package day708072022multidimensionalarray;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int num[][] = {{1,2,3},{2,3},{12,3,4,5}};
		System.out.println(num.length); // The number of rows
		for (int rows = 0; rows < num.length; rows++) {  //row
			for (int col = 0; col < num[rows].length; col++) {  //cols
				System.out.print(num[rows][col]+"\t");
			}
		System.out.println();
		}

	}

}

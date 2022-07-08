package day708072022multidimensionalarray;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int num[][] = new int[3][2]; // 3 rows and 2 columns
		System.out.println(num.length); // The number of rows
		for (int rows = 0; rows < num.length; rows++) {
			for (int col = 0; col < num[rows].length; col++) {
				System.out.print(num[rows][col]);
			}
		System.out.println();
		}

	}

}

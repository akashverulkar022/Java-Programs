package MultiDimentionArray;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a[] = { { 1, 2 }, { 3, 4 } };
		int i, j;
		int rowsize, colsize;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rowsize and columnsize :");
		rowsize = sc.nextInt();
		colsize = sc.nextInt();

		int b[][] = new int[rowsize][colsize];
		System.out.println("Enter Array Elements :");
		for (i = 0; i < rowsize; i++) {
			for (j = 0; j < colsize; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array :");
		for (i = 0; i < rowsize; i++) {
			for (j = 0; j < colsize; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Addition :");
		for (i = 0; i < rowsize; i++) {
			for (j = 0; j < colsize; j++) {
				System.out.print(a[i][j] + b[i][j] + "\t");

			}

		}
	}
}

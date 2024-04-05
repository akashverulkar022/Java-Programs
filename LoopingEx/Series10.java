package LoopingEx;

import java.util.Scanner;

public class Series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i, j, n, fact, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.print((int) i + "/" + (int) i + "!");
			fact = 1;
			for (j = 1; j <= i; j++)
				fact = fact * j;

			sum = sum + (i / fact);
			if (i < n)
				System.out.print(" + ");
		}
		System.out.println(" = " + sum);
	}

}

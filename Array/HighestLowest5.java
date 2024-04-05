package Array;

import java.util.Scanner;

public class HighestLowest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + " Elements");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		int highest = a[0];
		int lowest = a[0];
		for (i = 1; i < a.length; i++) {
			if (a[i] > highest)
				highest = a[i];

			if (a[i] < lowest)
				lowest = a[i];

		}
		System.out.println("highest:" + highest + "lowest" + lowest);
	}
}

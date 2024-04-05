package Basic;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		float A, l, b;

		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");

		l = sc.nextInt();
		b = sc.nextInt();

		A = l * b;
		System.out.println("Addition :" + A);

	}

}

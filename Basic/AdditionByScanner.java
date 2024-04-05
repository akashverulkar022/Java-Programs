package Basic;

import java.util.Scanner;

public class AdditionByScanner {

	public static void main(String[] args) {
		int a, b, c;

		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number :");
		a = sc.nextInt();
		b = sc.nextInt();

		c = a + b;

		System.out.println("Addition :" + c);

	}

}

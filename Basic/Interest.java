package Basic;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount :");
		int p = sc.nextInt();
		System.out.println("Enter the interest rate :");
		int r = sc.nextInt();
		System.out.println("Enter the time :");
		int t = sc.nextInt();

		int si = (p * r * t) / 100;
		System.out.println("Simple Interest :" + si);

	}

}

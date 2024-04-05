package ForLoop;

import java.util.Scanner;

public class FactorialOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact = 1, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		number = sc.nextInt();

		for (i = 1; i <= number; i++) {
			fact *= i;
		}
		System.out.println("Factorial of" + number + "is:" + fact);
	}

}

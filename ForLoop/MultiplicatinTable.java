package ForLoop;

import java.util.Scanner;

public class MultiplicatinTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		number = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "*" + i + " = " + number * i);

		}

	}
}

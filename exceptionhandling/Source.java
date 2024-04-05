package exceptionhandling;

import java.util.Scanner;

public class Source {
	public void checkAge(int age) throws MyException {
		if (age >= 15) {
			System.out.println("valid");
		} else {
			throw new MyException("Invalid");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Source obj = new Source();
		try {
			obj.checkAge(a);

		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

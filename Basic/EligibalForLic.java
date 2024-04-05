package Basic;

import java.util.Scanner;

public class EligibalForLic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		age = sc.nextInt();
		if (age > 18) {
			System.out.println("You are Eligibal :");
		} else {
			System.out.println("You are Not Eligibal :");
		}
	}
}

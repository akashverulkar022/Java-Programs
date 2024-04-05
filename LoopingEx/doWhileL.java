package LoopingEx;

import java.util.Scanner;

public class doWhileL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 2 Numbers :");
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a+b;
			
			System.out.println("Addition :" +c);
			
			System.out.println("Press Y to Continue");
			ch = sc.next().charAt(0);
}while (ch == 'y' || ch == 'Y');

	}

}

package WhileLoop;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rev=0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		
		while(n>0) {
			rem = n%10;
			rev =(rev*10)+rem;
			n =n/10;
			System.out.println("Reverse of Numbers :"+rev);
		}

	}

}

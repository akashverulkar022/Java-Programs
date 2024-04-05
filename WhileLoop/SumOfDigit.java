package WhileLoop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		
		while(n>0) {
			rem = n%10;
			sum =sum + rem;
			
			n =n/10;
			
			
		}
		System.out.println("sum of digit="+sum);
	}

}

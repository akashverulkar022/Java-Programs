package LoopingEx;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i, sum=0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			sum = sum +(1/i);
			System.out.print((int)i+ "/" +(int)i * (int)i);
			if(i<n);
			System.out.print(" + ");
			
		}
		System.out.println(" = "+sum);

	}

}
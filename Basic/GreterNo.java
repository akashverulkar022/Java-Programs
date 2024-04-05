package Basic;

import java.util.Scanner;

public class GreterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
	
	if(a>=b && a>=c) {
		System.out.println("1st is Greter :");
	}else if(b>=a && b>=c) {
		System.out.println("2nd is Greater :");
	}else  {
		System.out.println("3rd is Greater :");
	}
	}

}

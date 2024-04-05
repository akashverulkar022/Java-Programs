package Basic;

import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int numbers;
    Scanner sc = new  Scanner(System.in);
    System.out.println("Enter the Numbers :");
    numbers = sc.nextInt();
    
    if (numbers==0) {
    	System.out.println("Number is Zero :");
    }
    else if(numbers>0) {
    	System.out.println("Number is Positive");
    }
    else {
    	System.out.println("Number Is Negative");
    }
	}
}

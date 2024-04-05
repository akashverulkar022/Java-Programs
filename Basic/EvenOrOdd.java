package Basic;

import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int numbers;
    Scanner sc = new  Scanner(System.in);
    System.out.println("Enter Numbers :");
    numbers = sc.nextInt();
    
    if (numbers%2==0) {
    	System.out.println("This number are Even :");
    }
    else {
    	System.out.println("This number are Odd :");
    }
	}
}

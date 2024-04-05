package Test2;

import java.util.Scanner;

public class Source {

	   public static int getSecondSmallest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array must have at least two elements.");
	        }

	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int num : arr) {
	            if (num < smallest) {
	                secondSmallest = smallest;
	                smallest = num;
	            } else if (num < secondSmallest && num != smallest) {
	                secondSmallest = num;
	            }
	        }

	        return secondSmallest;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        /*
	         * System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        */

	        int[] inputArray = new int[6];
	       System.out.println("Enter the elements:");
	        for (int i = 0; i < 6; i++) {
	            inputArray[i] = scanner.nextInt();
	        }
	        int result = getSecondSmallest(inputArray);
	        System.out.println("Second smalles element : " +result);
	}

}

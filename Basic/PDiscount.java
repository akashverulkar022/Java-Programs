package Basic;

import java.util.Scanner;

public class PDiscount {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double purchaseAmount, discountAmount;
		System.out.println("Enter PurchaseAmount :");
		Scanner sc = new Scanner(System.in);
		purchaseAmount = sc.nextDouble();
		
		if (purchaseAmount >= 10000) {
			discountAmount = 0.1 * purchaseAmount;
			System.out.println("Discount Amount Your Purchase is :"+discountAmount);
		}else {
			discountAmount = 0.02 * purchaseAmount;
			System.out.println("Discount amount on your Purchase is :"+discountAmount);
		}
	}

}

package Basic;

import java.util.Scanner;

public class TaxIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double salary, taxamount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Salary :");
    salary = sc.nextDouble();
    if(salary<25000){
    	taxamount =0.1f *salary;
    }
    else {
    	taxamount =0.15f *salary;
    }
    System.out.println("Taxamount :"+taxamount);
    		
}

}

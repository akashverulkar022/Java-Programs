package abstraction;

import java.util.Scanner;

abstract class Bank{
	public abstract double getRateOfInterst();
}

class Axis extends Bank{
	@Override
	public double getRateOfInterst() {
		// TODO Auto-generated method stub
		return 8.5;
	}
	
}

class Sbi extends Bank{
	
	@Override
	public double getRateOfInterst() {
		// TODO Auto-generated method stub
		return 6.2;
	}
}

public class TestBank {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	double principleAmt, years, rateSbi, rateAxis;
	System.out.println("Enter Principle Amount and no. of Years :");
	principleAmt= sc.nextDouble();
	years= sc.nextDouble();
	
	Bank bank;
	
	bank=new Sbi();
	rateSbi= bank.getRateOfInterst();
	
	bank= new Axis();
	rateAxis= bank.getRateOfInterst();
	
	double interestSbi = principleAmt*years*rateSbi/100;
	double interestAxis = principleAmt*years*rateAxis/100;
	
	System.out.println("Simple interst for SBI :"+interestSbi);
	System.out.println("Simple interst for AXIS :"+interestAxis);
	}
}

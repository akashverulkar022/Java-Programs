package classesObject;

import java.util.Scanner;

public class Student {
	int rollNumber;
	String name;
	float java,cpp,python;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		name = sc.nextLine();		
		System.out.println("Enter rollNumber ");
		rollNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Marks pf Java,x++,Python");
		java =sc.nextFloat();
		cpp =sc.nextFloat();
		python =sc.nextFloat();	
	}
	
	public void calculate() {
/*
 * Local Variable
 */
		float total, percent;
		total = java+cpp+python;
		percent = total/3;
		System.out.println("Students RollNumber :"+rollNumber);
		System.out.println("Students name :"+name);
		System.out.println("Total1 :"+total);
		System.out.println("Percent :"+percent);
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();//object creation
		student1.accept();//method calling
		student1.calculate();
		
	}

}

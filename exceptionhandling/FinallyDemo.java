package exceptionhandling;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("case 1 : where exception doesn't occur");
		try {
			int a = 10/5;
			System.out.println("Div :"+a);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 1 : always executes");
		}
		System.out.println("case 2 : where exception occurs and handles");
		try {
			int a = 10/0;
			System.out.println("Div :"+a);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("case 2 : always executes");
		}
		System.out.println("case 3 : where exception doesn't handled");
		try {
			String s = null;
			System.out.println(s.length());
			
		} /*catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		finally {
			System.out.println("case 3 : always executes");

	}
		System.out.println("rest of code.....");
	}
}

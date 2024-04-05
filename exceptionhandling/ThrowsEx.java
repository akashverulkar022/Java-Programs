package exceptionhandling;

public class ThrowsEx {
	
	static void checkAge(int age) {
		if(age>=18) {
			System.out.println("Welcome to vote");
		}
		else {
			throw new ArithmeticException("Age is not Valid");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(2);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("rest of code....");
	}

}

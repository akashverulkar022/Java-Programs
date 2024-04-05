package exceptionhandling;

public class NestedTrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				String s = null;
				System.out.println(s.length());
			}
			catch (NullPointerException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				String s1 = "abc";
				System.out.println(Integer.parseInt(s1));
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("another lines.....");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code.......");

	}

}

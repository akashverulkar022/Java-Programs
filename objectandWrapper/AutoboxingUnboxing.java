package objectandWrapper;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		Integer obj1 = a; //Autoboxing primitive - object
		
		Integer obj3 = Integer.valueOf(a); //before java5
		System.out.println(obj1);
		
		Integer obj2 = new Integer(20);
		
		int b = obj2; //unboxing: object - primitive
		
		int c = obj2.intValue(); //before java5
		System.out.println(b);

	}

}

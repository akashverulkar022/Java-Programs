package java8features;

@FunctionalInterface
interface Addable{
	int add(int p, int q);
}
public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1 = (x,y) -> x+y;
		System.out.println("Add :"+a1.add(12, 2));

	}

}

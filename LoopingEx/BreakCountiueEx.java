package LoopingEx;

public class BreakCountiueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Break Example");
		for(i=1; i<=10; i++) {
			if(i==5)
				break;
			System.out.println(i+" ");
			
		}
		System.out.println("\ncontinue example");
		for(i=1; i<=10; i++) {
		if(i==5)
			continue;
		System.out.println(i+" ");
		}

	}

}

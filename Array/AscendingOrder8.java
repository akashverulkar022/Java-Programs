package Array;

import java.util.Scanner;

public class AscendingOrder8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Elements");

		for (i = 0; i < a.length; i++)
			
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		int temp;
		for(i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted Array");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}

package fundamentals;

import java.util.Scanner;

public class subOfAllElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = s.nextInt();
		int [] a = new int[n];
		for(int j = 0 ; j< n ; j++) {
			System.out.println("Enter the "+(j+1)+"th number");
			a[j] = s.nextInt();
		}
		int t = 0;
		for(int i = 0 ; i<a.length ; i++) {
			t += a[i];
		}
		System.out.print("sum of all elements of array is :"+t);
	}

}

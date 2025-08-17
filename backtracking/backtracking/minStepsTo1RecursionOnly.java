
package backtracking;

import java.util.Scanner;

public class minStepsTo1RecursionOnly {
	public static int countNTo1RecursionOnly(int n) {
		if(n==1) {
			return 0;
		}
		int s1 = Integer.MAX_VALUE;
		int s2 = Integer.MAX_VALUE;
		int s3 = Integer.MAX_VALUE;
		s1 = countNTo1RecursionOnly(n-1);
		if(n%2 == 0) {
			s2 = countNTo1RecursionOnly(n/2);
		}
		if(n%3 == 0) {
			s3 = countNTo1RecursionOnly(n/3);
		}
		return Math.min(s1,Math.min(s2, s3))+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		System.out.print(countNTo1RecursionOnly(n));
		
		

	}

}

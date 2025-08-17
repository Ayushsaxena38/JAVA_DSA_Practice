package fundamentals;

import java.util.Scanner;

public class factorialRecursion {
	public static int fact(int n) {
		if(n<=0) {
			return 1;
		}
		int ans = n*fact(n-1);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number to find Factorial :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print("factorial of "+n+" is :"+fact(n));
	}

}

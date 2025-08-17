package DP1;

import java.util.Scanner;

public class staieCaseIterativePlusDP {
	public static long staircase(int n) {
		//Your code goes here
		if(n == 0 || n == 1 || n == 2){
			return n;
		}
		long[] dp = new long[n+1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3 ; i <= n ; i++){
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		long ans = staircase(n);
		System.out.println(ans);
		

	}

}

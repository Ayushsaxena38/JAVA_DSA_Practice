package backtracking;

import java.util.Scanner;

public class minStepsTo1RecursionPlusDP {
	public static int countminsteps(int n , int[]dp) {
		if(n==1) {
			return 0;
		}
		int s1 = Integer.MAX_VALUE;
		int s2 = Integer.MAX_VALUE;
		int s3 = Integer.MAX_VALUE;
		if(dp[n-1] == -1) {
			s1 = countminsteps(n-1,dp);
			dp[n-1] = s1;
		}else {
			s3 = dp[n-1];
		}
		if(n%2 == 0) {
			
			if(dp[n/2] == -1) {
				s2 = countminsteps(n/2,dp);
				dp[n/2] = s2;
			}else {
				s2 = dp[n/2];
			}
		}
		if(n%3 == 0) {
			if(dp[n/3] ==-1) {
				s3 = countminsteps(n/3,dp);
				dp[n/3] = s3;
			}else {
				dp[n/3] = s3;
			}
		}
		return Math.min(s1,Math.min(s2, s3))+1;
	}
	public static int count(int n) {
		int[] dp = new int[n+1];
		for(int i = 0; i <= n ; i++) {
			dp[i] = -1;
		}
		return countminsteps(n, dp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		System.out.print(count(n));
		
		

	}

}

package backtracking;

import java.util.Scanner;

public class minimumNumberOfSquaresRecursionPlusDP {
	public static int count(int n , int[] dp) {
		//Your code goes here
		// if(n < 0){
		// 	return Integer.MAX_VALUE;
		// }
		if(n == 0 || n == 1 || n == 2 || n == 3 ){
			return n;
		}
		int x = 0;
		for(int i =	1 ; i < n ; i++){
			if(i*i == n){
				return 1;
			}
			if(i*i > n){
				x = i-1;
				break;
			}
		}
		int ans = Integer.MAX_VALUE;
		int a = 0;
		for(int i = 1 ; i<=x; i++){
			int k = i*i;
			if(dp[n-k] == -1){
				a = minCount(n-k);
				dp[n-k] = a;
			}else{
				a = dp[n-k];
			}
			ans = Math.min(ans,a);
		}
		return ans+1;
	}
	public static int minCount(int n){
		int[] dp = new int[n+1];
		for(int i = 0; i<=n ; i++){
			dp[i] = -1;
		}
		return count(n,dp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		System.out.print(minCount(n));

	}

}

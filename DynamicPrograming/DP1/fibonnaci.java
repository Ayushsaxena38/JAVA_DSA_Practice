package DP1;

import java.util.Scanner;

public class fibonnaci {
	public static int helper(int n){//Recursive Code
        if(n<=1){
            return n;
        }
        
        return helper(n-1)+helper(n-2);

    }
    public static int helper1(int n , int[] dp){//Memoization Code
         if(n<=1){
            return dp[n] = n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] =  helper(n-1)+helper(n-2);

    }
    public static int helper2(int N , int[] dp){//Tabulation Code or Iterative Code
        for(int n = 0 ; n <= N ; n++){
                if(n<=1){
                dp[n] = n;
                continue;
            }
            
             dp[n] = dp[n-1]+dp[n-2]; //helper(n-1)+helper(n-2);
        }
        return dp[N];
    }

    public static int fib(int n) {
        // return helper(n);
        int[] dp = new int[n+1];
        // return helper1(n , dp);
        return helper2(n,dp);

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to get that fibonacci number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n+"th fibonacci number is :"+fib(n));

	}

}

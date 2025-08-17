package DP1;

import java.util.Scanner;

public class stairCase {
	public static int helper(int n){
        if(n == 0){
            return 1;
        }else if(n<0){
            return 0;
        }
        int ans = 0 ;
        int a1 = helper(n-1);
       
        int a2 = helper(n-2);
        ans += a1 + a2;

        return ans;
    }
    public static int helper1(int n , int[] dp){
        if(n == 0){
            return dp[n] = 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = helper1(n-1,dp)+helper1(n-2,dp);
    }
    public static int helper2(int N, int[] dp){

        for(int n = 0; n <= N ;n++){
            if(n == 0){
                dp[n] = 1;
                continue;
            }
            if(n<0){
                continue;
            }
            
            dp[n] = dp[n-1]+dp[n-2];//helper1(n-1,dp)+helper1(n-2,dp);
        }
        return dp[N];
    }
    public static int climbStairs(int n) {
        // return helper(n);
        int[] dp = new int[n+1];
        for(int i = 0 ; i <= n ;i++){
            dp[i] = -1;
        }
        return helper1(n,dp);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of Stairs for getting total number of ways to climb Stairs by step 1 and step 2");
		int n = s.nextInt();
		System.out.println("Total Number of Ways to reach from "+ n + " to 0 by only taking step 1 and step 2 is :"+ climbStairs(n));
		
	}

}

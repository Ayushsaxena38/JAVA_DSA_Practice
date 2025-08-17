package DP1;

public class staircaseRecursionPlusDp {
	
	public static long sc(long n , long[] dp){
		if(n==0){
			return 1;
		}
		long a1,a2,a3;
		if(n>=1&&dp[(int)n-1] == -1){
			a1 = sc(n-1,dp);
			dp[(int)(n-1)] = a1;
		}else{
			if(n>=1){
				a1 = dp[(int)(n-1)];
			}else{
				a1 = 0;
			}
		}
		if (n>=2&&dp[(int)(n-2)] == -1) {
			a2 = sc(n-2, dp);
			dp[(int)(n-2)] = a2;
		} else {
			if(n>=2){
				a2 = dp[(int)(n-2)];
			}else{
				a2 = 0;
			}
		}
		if (n>=3&&dp[(int)(n-3)] == -1) {
			a3 = sc(n-3, dp);
			dp[(int)(n-3)] = a3;
		} else {
			if(n>=3){
				a3 = dp[(int)(n-3)];
			}else{
				a3 = 0;
			}
		}
		return a1+a2+a3;

	}

	public static long staircase(int n) {
		//Your code goes here
		if(n == 0){
			return 0;
		}
		long[] dp = new long[n+1];
		for(int i = 0 ; i  <= n ;i++){
			dp[i] = -1;
		}
		// dp[0] = 0;
		// long b = n;
		long ans = sc(n,dp);
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = staircase(16);
		System.out.print(a);

	}

}

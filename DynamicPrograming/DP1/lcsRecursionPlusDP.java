package DP1;

public class lcsRecursionPlusDP {
	public static int lcs(String a , String b ) {
		int[][] dp = new int[a.length()+1][b.length()+1];
		for(int i = 0 ; i < a.length(); i++) {
			for(int j = 0 ; j < b.length(); j++){
				dp[i][j] = -1;
			}
		}
		return helper(a,b,0,0,dp);
	}

	public static int helper(String a, String b, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub
		int m = a.length();
		int n = b.length();
		if(i == m || j == n) {
			return 0;
		}
		if(a.charAt(i) == b.charAt(j)) {
			int a1;
			if(dp[i+1][j+1] == -1) {
				a1 = helper(a,b,i+1,j+1,dp);
				dp[i+1][j+1] = a1;
			}else {
				a1 = dp[i+1][j+1];
			}
			return 1+a1;
		}else {
			int a2,a3;
			if(dp[i+1][j] == -1) {
				a2 = helper(a,b,i+1,j,dp);
				dp[i+1][j] = a2;
			}else {
				a2 = dp[i+1][j];
			}
			if(dp[i][j+1] == -1) {
				a3 = helper(a,b,i,j+1,dp);
				dp[i][j+1] = a3;
			}else {
				a3 = dp[i][j+1];
			}
			return Math.max(a2,a3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ayush";
		String b = "saxena";
		System.out.println(lcs(a,b));

	}

}

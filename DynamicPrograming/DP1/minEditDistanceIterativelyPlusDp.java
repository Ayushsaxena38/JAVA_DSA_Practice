package DP1;

public class minEditDistanceIterativelyPlusDp {
	
	public static int editDistance(String s, String t) {
		//Your code goes here
		int m = s.length();
		int n = t.length();
		int[][] dp = new int[m+1][n+1];
		for(int i = m; i > 0; i--){
			dp[i][0] = i;
		}
		for(int i = n ; i >0 ; i--){
			dp[0][i] = i;
		}

		for(int i = 1; i<=m; i++){
			for(int j = 1 ; j <= n ; j++){
				if(s.charAt(i-1) == t.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1];
				}else{
					int a = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
					dp[i][j] = 1+a;
				}
			}
		}
		return dp[m][n];
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Ayush";
		String b = "Saxena";
		System.out.println(editDistance(a, b));

	}

}

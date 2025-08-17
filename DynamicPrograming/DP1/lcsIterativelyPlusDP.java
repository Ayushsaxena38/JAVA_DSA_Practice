package DP1;

public class lcsIterativelyPlusDP {
	
	public static int lcs(String s, String t) {
		//Your code goes here
		int m = s.length();
		int n = t.length();
		int[][] dp = new int[m+1][n+1];
		
		for(int i = m-1; i >=0 ; i--){
			for(int j = n-1 ; j >= 0 ; j--){
				if(s.charAt(i) == t.charAt(j)){
					dp[i][j] = dp[i+1][j+1] +1;
				}else{
					dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
				}
			}
		}
		return dp[0][0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ayush";
		String b = "saxena";
		System.out.println(lcs(a,b));
	}

}

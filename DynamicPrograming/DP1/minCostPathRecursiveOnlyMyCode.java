package DP1;

public class minCostPathRecursiveOnlyMyCode {
	public static int helper(int[][] cost , int x , int y , int sum){
		int n = cost.length;
		int m = cost[0].length;
		if(x>=n || y>=m ) return Integer.MAX_VALUE;
		if(x == n-1 && y == m-1 ){
			sum += cost[x][y];
			return sum;
		}
		sum += cost[x][y];
		int minright = helper(cost , x , y+1 , 0);
		int mindown = helper(cost , x+1 , y , 0);
		int mindiag = helper(cost , x+1 , y+1 , 0);

		sum += Math.min(minright, Math.min(mindown, mindiag));
		return sum;
	}

	public static int minCostPath(int[][] input) {
		//Your code goes here
		int sum = 0;
		sum = helper(input , 0 ,0,sum);
		return sum;
	}
}

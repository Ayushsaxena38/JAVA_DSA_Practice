package DP1;

public class knapsackResursiveOnly {
	public static int helper(int[] weights , int[] values , int si , int maxWeight , int profit){
		int n = weights.length;
		if(maxWeight == 0 || si == n ){
			return profit;
		}
		int a = helper(weights,values,si+1,maxWeight,profit);
		if(maxWeight-weights[si] >= 0){
			maxWeight -= weights[si];
			profit += values[si];
		
			int b = helper(weights,values,si+1,maxWeight,profit);
			return Math.max(a,b);
		}
		return a;

	}
	public static int knapsack(int[] weights, int[] values, int maxWeight) {
		//Your code goes here
		return helper(weights,values,0,maxWeight,0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weights = {1,2,4, 5};
		int[] values = {5, 4 ,8, 6};
		int maxWeight = 5;
		System.out.println(knapsack(weights,values,maxWeight));
	}

}

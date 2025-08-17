package backtracking;

import java.util.Scanner;

public class minimumNumberOfSquaresRecursionOnly {
	public static int minCount(int n) {
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
		for(int i = 1 ; i<=x; i++){
			int k = i*i;
			ans = Math.min(ans , minCount(n-k));
		}
		return ans+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		System.out.print(minCount(n));
		
		

	}
}

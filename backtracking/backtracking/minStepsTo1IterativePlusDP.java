package backtracking;

import java.util.Scanner;

public class minStepsTo1IterativePlusDP {
	
	public static int count(int n , int steps){
		if(n==1){
			return 0;
		}
		int s1 = Integer.MAX_VALUE;
		int s2 = Integer.MAX_VALUE;
		int s3 = Integer.MAX_VALUE;
		s1 = count(n-1,steps+1);
		if(n%2 == 0){
			s2 = count(n/2 , steps+1);
		}
		if(n%3 == 0){
			s3 = count(n/3,steps+1);
		}
		steps = Math.min(s1, Math.min(s2,s3))+1;
		return steps;
	}
	public static int countMinStepsToOne(int n) {
		//Your code goes here
		return count(n,0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		System.out.print(countMinStepsToOne(n));
		
		

	}

}

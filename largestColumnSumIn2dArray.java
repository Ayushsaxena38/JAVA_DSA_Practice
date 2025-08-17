package fundamentals;

import java.util.Scanner;

public class largestColumnSumIn2dArray {
	
	public static int larColSun(int [][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int lar = Integer.MIN_VALUE;
		for(int j = 0; j<m; j++) {
			int s = 0;
			for(int i = 0 ; i<n ; i++) {
				s = s + arr[i][j];
			}
			if(lar < s) {
				lar = s;
		}
		}
		return lar;
	}
	public static int[][] takeInput(){
		// for taking inputs in array
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the number of rows and columns in the 2d arrar");
				int n = s.nextInt();
				int m = s.nextInt();
				int arr[][]=new int[n][m];
				    for(int i=0;i<n;i++)
				    {
				        for(int j=0;j<m;j++) {
				        System.out.println("enter the value in " + i + "th row and" + j+"th column");
				        arr[i][j] = s.nextInt();
				    }
				}
				    return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = takeInput();
		System.out.println(larColSun(arr));

	}

}

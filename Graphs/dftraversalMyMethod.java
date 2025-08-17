package Graphs;

import java.util.Scanner;

public class dftraversalMyMethod {
	public static void dftraversalMyMethod(int[][] adjMatrix , int n, int x) {
		//check is x is a valid index or not;
		if(x < 0 || x >= n) {
			return;
		}
		//if yes then print x
		System.out.print(x+" ");
		//now break all connection from its childrens with x;
		for(int i = 0 ; i<n ;i++) {
			if(adjMatrix[i][x] == 1) {
				adjMatrix[i][x] = 0;
			}
		}
		//now go for its children;
		for(int i= 0 ; i < n ;i++) {
			if(adjMatrix[x][i] == 1) {
				if( i != x) {
//					System.out.print(i);
					adjMatrix[x][i] = 0;
					dftraversalMyMethod( adjMatrix , n , i);
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//total number of Vertices;
		int e = s.nextInt();//total number of Edges;
		int[][] adjMatrix = new int[n][n];
		for(int i = 0; i < e ; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		//print the adjacency Matrix;
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n ; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter the starting node for DFT");
		int x = s.nextInt();
		dftraversalMyMethod(adjMatrix, n, x);
	}

}

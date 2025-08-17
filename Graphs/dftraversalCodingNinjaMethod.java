package Graphs;

import java.util.Scanner;

public class dftraversalCodingNinjaMethod {
	
	public static void dftraversal(int[][] adjmetrix , int currentVertex , boolean[] visited) {
		visited[currentVertex] = true;
		System.out.print(currentVertex + " ");
		for(int i = 0 ; i < adjmetrix.length ; i++) {
			if(adjmetrix[currentVertex][i] == 1 && visited[i] == false) {
				dftraversal(adjmetrix , i , visited);
			}
		}
	}
	
	public static void dftraversal(int[][] adjmetrix ) {
		boolean[] visited = new boolean[adjmetrix.length];
		dftraversal(adjmetrix , 0 , visited);
		
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
		
		dftraversal(adjMatrix);
	}

}

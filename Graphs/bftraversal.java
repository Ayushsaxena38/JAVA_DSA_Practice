package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bftraversal {
	public static void bftraversal(int[][] adjmatrix ) {
		boolean visited[] = new boolean[adjmatrix.length];
		//by default in boolean Array false is present in each index;
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		visited[0] = true;
		int c = q.size();
		while(!q.isEmpty()) {
			while(c>0) {
				int cv = q.poll();
				System.out.print(cv+" ");
				for(int i= 0 ; i< adjmatrix.length; i++) {
					if(adjmatrix[cv][i] == 1 && visited[i] == false) {
						q.add(i);
						visited[i] = true;
					}
				}
				c--;
			}
			c = q.size();
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
		bftraversal(adjMatrix);
	}

}

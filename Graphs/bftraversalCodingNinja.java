package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bftraversalCodingNinja {
	
	public static void bftraversal(int[][] adjMatrix,int current, boolean[] visited) {
		Queue<Integer> pendingVertices = new LinkedList<>();
		pendingVertices.add(current);
		visited[current] = true;
		while(!pendingVertices.isEmpty()) {
			int cv = pendingVertices.poll();
			System.out.print(cv+" ");
			for(int i = 0 ; i<adjMatrix.length; i++) {
				if(adjMatrix[cv][i] == 1 && visited[i] == false) {
					pendingVertices.add(i);
					visited[i] = true;
				}
			}
		}
		
	}
	
	public static void bft(int[][] adjMatrix) {
		boolean visited[] = new boolean[adjMatrix.length];
		for(int i = 0 ; i<adjMatrix.length ; i++) {
			if(!visited[i])
				bftraversal( adjMatrix,i,  visited);
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
		bft(adjMatrix);
	}

}

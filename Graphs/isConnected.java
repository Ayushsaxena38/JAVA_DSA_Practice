package Graphs;

import java.util.Scanner;

public class isConnected {
	
	public static void dfs(int[][] adj , boolean[] visited,int si){
		visited[si] = true;
		for(int i = 0 ; i< adj.length; i++){
			if(adj[si][i] == 1 && !visited[i]){
				dfs(adj,visited,i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int e = s.nextInt();
		 if(n==0){
			 System.out.println(true);
			 return;
		 }
		 if( e<n-1){
			 System.out.println(false);
			 return;
		 }
		 int[][] adj = new int[n][n];
		 for(int i = 0 ; i < e; i++){
			 int v1 = s.nextInt();
			 int v2 = s.nextInt();
			 adj[v1][v2] = 1;
			 adj[v2][v1] = 1;
			}
		boolean visited[] = new boolean[n];
		dfs(adj , visited,0);
		int a = Integer.MIN_VALUE;
		System.out.println(a+1);
		for(int i= 0 ; i<n;i++){
			if(visited[i] == false){
				System.out.println(false);
				return;
			}
		}
		
		System.out.println(true);
	}

}

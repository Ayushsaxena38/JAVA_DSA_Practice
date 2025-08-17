package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class getpathDFSCodingNinja {
	
	public static ArrayList<Integer> dfs(int[][] adj , int sv , int ev){
		boolean[] visited = new boolean[adj.length];
		ArrayList<Integer> ans = dfsHelper(adj , visited, sv,ev);
		return ans;
	}

	private static ArrayList<Integer> dfsHelper(int[][] adj, boolean[] visited, int sv, int ev) {
		// TODO Auto-generated method stub
		if(sv == ev) {
			ArrayList<Integer> ans = new ArrayList<>();
			ans.add(sv);
			return ans;
		}
		visited[sv] = true;
		int n = adj.length;
		for(int i = 0 ;i < n ;i++) {
			if(adj[sv][i] == 1 && !visited[i]) {
				ArrayList<Integer> so = dfsHelper(adj,visited,i,ev);
				if(so != null) {
					so.add(sv);
					return so;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of vertices");
		 int n = s.nextInt();
		 System.out.println("enter the number of edges");
		 int e = s.nextInt();
		 System.out.println("now one by one enter each edge");
		 int[][] adj = new int[n][n];
		 for(int i = 0 ; i < e ; i++){
			 int v1 = s.nextInt();
			 int v2 = s.nextInt();
			 adj[v1][v2] = 1;
			 adj[v2][v1] = 1;
		 }
		 System.out.println("Enter the start vertex and end vertex for finding the path");
		 int v1 = s.nextInt();
		 int v2 = s.nextInt();
		 ArrayList<Integer> a = dfs(adj,v1,v2);
		 if(a == null) {
			 System.out.println("There is No Path Between Start Vertex and End Vertex ");
			
		 }else {
			 System.out.println("Path: ");
			 for(int i= 0 ; i<a.size(); i++){
				 System.out.print(a.get(i)+" ");
			 }
		 }
	}

}

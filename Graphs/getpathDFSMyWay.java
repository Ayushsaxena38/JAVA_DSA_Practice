package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class getpathDFSMyWay {
	public static ArrayList<Integer> helper(int[][] adj,boolean[] visited , int si , int v2){
		if(si == v2){
			ArrayList<Integer> output = new ArrayList<>();
			output.add(si);
			return output;
		}
		ArrayList<Integer> myans = new ArrayList<>();
		for(int i = 0 ; i < visited.length; i++){
			if(adj[si][i] == 1 && visited[i] == false){
				visited[i] = true;
				ArrayList<Integer> so = helper(adj, visited, i, v2);
				if(so.size() != 0){
					myans = so;
				}
			}
		}
		if(myans.size() == 0){
			return new ArrayList<>();
		}
		myans.add(0,si);
		return myans;
	}
	public static ArrayList<Integer> dfs(int[][] adj , int v1, int v2){
		ArrayList<Integer> ans = new ArrayList<>();
		boolean visited[] = new boolean[adj.length];
//		int len = Integer.MAX_VALUE;
		visited[v1] = true;
		for(int i = 0 ; i < adj.length; i++){
			if(adj[v1][i] == 1&&visited[i]==false){
				visited[i] = true;
				ArrayList<Integer> sa = helper(adj,visited,i,v2);
				if(sa.size() != 0){
					ans = sa;
				}
			}
		}
		if(ans.size() == 0){
			return ans;
		}
		ans.add(0,v1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int e = s.nextInt();
		 int[][] adj = new int[n][n];
		 for(int i = 0 ; i < e ; i++){
			 int v1 = s.nextInt();
			 int v2 = s.nextInt();
			 adj[v1][v2] = 1;
			 adj[v2][v1] = 1;
		 }
		 int v1 = s.nextInt();
		 int v2 = s.nextInt();
		 ArrayList<Integer> a = dfs(adj,v1,v2);
		 for(int i= 0 ; i<a.size(); i++){
			 System.out.print(a.get(i)+" ");
		 }

	}

}

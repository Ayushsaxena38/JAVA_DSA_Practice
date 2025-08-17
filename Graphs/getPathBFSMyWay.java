package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class getPathBFSMyWay {
	public static ArrayList<Integer> getPathBFS(int[][] adj , int sv , int ev){
		boolean visited[] = new boolean[adj.length];
		HashMap<Integer,Integer> map = new HashMap<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(sv);
		visited[sv] = true;
		map.put(sv, -1);
		ArrayList<Integer> ans = new ArrayList<>();
		while(!q.isEmpty()){
			int cv = q.poll();
			if(cv == ev){
				ans.add(cv);
				while(map.get(cv)!=-1){
					ans.add(map.get(cv));
					cv = map.get(cv);
					
				}
				break;
			}
			for(int i = 0 ; i < adj.length;i++){
				if(adj[cv][i] == 1 && !visited[i]){
					visited[i]=true;
					q.add(i);
					map.put(i,cv);
				}
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int e = s.nextInt();
		 int[][] adj = new int[n][n];
		 for(int i = 0 ; i<e ;i++){
			 int v1 = s.nextInt();
			 int v2 = s.nextInt();
			 adj[v1][v2] = 1;
			 adj[v2][v1] = 1;
		 }
		 System.out.println("Enter the Start Vertex ans End Vertex to Find Path Between Them");
		 int sv = s.nextInt();
		 int ev = s.nextInt();
		 ArrayList<Integer> ans = getPathBFS(adj , sv, ev);
		 if(ans!=null) {
			 System.out.println("Path: ");
			  for(int i = 0 ; i<ans.size(); i++){
			 System.out.print(ans.get(i)+" ");
			  }
		 }else {
			 System.out.println("There is No Path Between Start Vertex and End Vertex");
		 }
		

	}

}

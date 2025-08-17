package backtracking;

public class ratInAMazeBoolean {
	public static boolean helper(int maze[][] , int path[][] ,int x ,int y) {
		int n = maze.length;
		// check whether the position if valid or not
		if(x>=n || y >= n || x<0 || y < 0 || maze[x][y] == 0 || path[x][y] == 1) {
			return false;
		}
		// fill the cell
		path[x][y] = 1;
		// check destination.
		if(x==n-1&&y==n-1) {
			return true;
		}
		//make recursive call in all directions 
		// top
		if(helper(maze,path,x-1,y)) {
			return true;
		}
		// right
		if(helper(maze,path,x,y+1)) {
			return true;
		}
		// down 
		if(helper(maze,path,x+1,y)) {
			return true;
		}
		// left
		if(helper(maze,path,x , y+1)) {
			return true;
		}
		// if you came this far means here in this function the ans is no
		return false;
		
	}
	public static boolean ratInamaze(int maze[][] ) {
		int [][] path = new int[maze.length][maze[0].length];
		boolean a = helper(maze,path,0,0);
		for(int i = 0 ; i < maze.length ; i ++) {
			for(int j = 0 ; j < maze.length; j++) {
				System.out.print(path[i][j] + " ");
			}
			System.out.println();
		}
		
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = new int[3][3];
		for(int i = 0 ; i<3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				if(i==0 && j == 2) {
					maze[i][j] = 0;
					continue;
				}else if( i== 1 && j == 2) {
					maze[i][j] = 0;
					continue;
				}
				maze[i][j] = 1;
			}
		}
		System.out.print(ratInamaze(maze));
		
		

	}

}

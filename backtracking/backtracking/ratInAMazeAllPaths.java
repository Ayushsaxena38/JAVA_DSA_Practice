package backtracking;

public class ratInAMazeAllPaths {
	public static void ratMazeAllPaths(int[][] maze, int[][] paths ,int x , int y ,int n) {
		// check for valid index
		if(x >= n || y >= n || x<0 || y < 0 || maze[x][y] == 0 || paths[x][y] == 1) {
			return;
		}
		paths[x][y] = 1;
		
		// check for destination 
		if(x == n-1 && y == n-1) {
			// print the path
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					System.out.print(paths[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			paths[x][y] = 0;
			return;
		}
		
		// Recursively call in all directions
		// top
		ratMazeAllPaths(maze,paths,x+1,y,n);
		//right
		ratMazeAllPaths(maze, paths, x, y+1, n);
		//down
		ratMazeAllPaths(maze, paths, x-1, y, n);
		//left
		ratMazeAllPaths(maze, paths, x, y-1, n);
		//reset the current element in paths to 0
		paths[x][y] = 0;
	}
	
	public static void main(String[]args) {
		int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		int[][] paths = new int[3][3];
		ratMazeAllPaths(maze, paths, 0, 0, 3);
		
		
	}

}

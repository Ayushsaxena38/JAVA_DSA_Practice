package backtracking;

public class nQueensProgram {
	public static boolean isQueenSafe(int[][] chess, int x , int y) {
		int n = chess.length;
		for(int i = x-1 ; i >= 0 ; i-- ) {
			if(chess[i][y] == 1) {
				return false;
			}
		}
		for(int i = x-1, j = y-1; i >= 0 && j >= 0 ; i--,j--) {
			if(chess[i][j] == 1) {
				return false;
			}
		}
		for(int i = x-1 , j = y+1 ; i >= 0 && j < n ; i--,j++) {
			if(chess[i][j] == 1) {
				return false;
			}
		}
		return true;
	}
	
	public static void nQueen(int[][] chess, int row) {
		int n = chess.length;
		// check for destination 
		if(row == n) {
			// print the chess board
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					System.out.print(chess[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		
		for(int i = 0 ; i<n ; i++) {
			if(isQueenSafe(chess,row,i)) {
				chess[row][i] = 1;
				nQueen(chess,row+1);
				chess[row][i] = 0;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] chess = new int[4][4];
		nQueen(chess,0);

	}

}

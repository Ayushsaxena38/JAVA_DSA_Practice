package backtracking;

public class nQueensInNRowsWithoutSafety {
	static int a = 1;
	public static void nQueensWOSafety(int[][] chess , int row) {
		int n = chess.length;
		// check for destination
		if(row == n) {
			System.out.print(a);//for checking no of paths
			System.out.println();
			// print the chess board
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					System.out.print(chess[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			a++;
			return;
		}
		for(int i = 0 ; i < n ;i++) {
			chess[row][i] = 1;
			nQueensWOSafety(chess, row+1);
			chess[row][i] = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] chess = new int[4][4];
		nQueensWOSafety(chess, 0);

	}

}

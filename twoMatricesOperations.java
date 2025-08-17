package fundamentals;

public class twoMatricesOperations{
	public static int[][] additionOfTwoMatrices(int [][] a , int [][] b){
		int [][]ans = new int[a.length][b[0].length];
		for(int i = 0 ; i<a.length ; i++){
			for(int j = 0 ; j<a[0].length ; j++){
				ans[i][j] = a[i][j] + b[i][j];
			}
		}
		return ans;
	}
	
	public static int[][] subtractionOfTwoMatrices(int [][] a , int [][] b){
		int [][]ans = new int[a.length][b[0].length];
		for(int i = 0 ; i<a.length ; i++){
			for(int j = 0 ; j<a[0].length ; j++){
				ans[i][j] = a[i][j] - b[i][j];
			}
		}
		return ans;
	}
	
	public static int [][] multiply(int [][] a , int [][] b){
		int sum = 0 ;
		int [][] ans = new int[a.length][b[0].length];
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < b[0].length; j++) {
				for(int k = 0 ; k < a[0].length ; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				ans[i][j] = sum;
				sum = 0;
			}
		}
		return ans;
	}
	
	public static void main(String[]args) {
		
		
	}
	
}

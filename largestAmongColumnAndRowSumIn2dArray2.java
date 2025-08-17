package fundamentals;

import java.util.Scanner;

public class largestAmongColumnAndRowSumIn2dArray2 {
	
	public static void findLargest(int mat[][]){ 
		int row = mat.length;
        int q = 0;
        int w = 0;
        if(row == 1){
            int m = mat[0].length;
            int s = Integer.MIN_VALUE;
            for(int i = 0 ; i < m ; i++){
                s = s + mat[0][i];
            }
            System.out.print("row 0 " + s);
        }else if(row == 0){
            int s = Integer.MIN_VALUE;
            System.out.print("row 0 " + s);
            
        }else{
            int col = mat[0].length;
            int c = 0;
            int colSum = Integer.MIN_VALUE;

            for(int j = 0; j<col; j++) {
                int l = 0;
                for(int i = 0 ; i<row ; i++) {
                    l = l + mat[i][j];
                    q = j;

                
                if(colSum < l) {
                    colSum = l;
                    c = q;
                }
                }
            }
            int rowSum = Integer.MIN_VALUE;
            int k = 0;

            for(int i = 0 ; i < row ; i++){
                int s = 0;
                for(int j = 0 ; j<col ; j++){
                    s = s + mat[i][j];
                    w = i;
                

                if(rowSum<s){
                    rowSum = s;
                    k = w;
                }
                }
            }
            if(rowSum > colSum){
                System.out.print("row " + k + " " + rowSum);
            }else if(colSum == rowSum){
                System.out.print("row " + k + " " + rowSum);
            }else{ 
                System.out.print("column " + c + " " + colSum);
            }
        }
    
	}	
	public static int[][] takeInput(){
		// for taking inputs in array
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the number of rows and columns in the 2d arrar");
				int n = s.nextInt();
				int m = s.nextInt();
				int arr[][]=new int[n][m];
				    for(int i=0;i<n;i++)
				    {
				        for(int j=0;j<m;j++) {
				        System.out.println("enter the value in " + i + "th row and" + j+"th column");
				        arr[i][j] = s.nextInt();
				    }
				}
				    return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = takeInput();
		findLargest(arr);

	}

}

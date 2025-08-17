package fundamentals;
import java.util.Scanner;
public class array2dTakiingInputAndPrint {

	public static void main(String[] args) {
		// for taking inputs in array
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the 2d arrar");
		int n = s.nextInt();
		int m = s.nextInt();
		int arr[][]=new int[n][m];
		    for(int i=0;i<4;i++)
		    {
		        for(int j=0;j<5;j++) {
		        System.out.println("enter the value in " + i + "th row and" + j+"th column");
		        arr[i][j] = s.nextInt();
		    }
		}
	
	//for printing array elements
	 for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<5;j++) {
	        	System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}

package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class praactice {
	public static void main(String[] args) {
		/* Your class should be named Solution.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] don = new int[n];
		for(int i = 0 ; i < n ; i++){
			don[i] = s.nextInt();
		}
		int a = n/4;
		int index = 0 ;
		for(int i = 0 ; i<a ; i++){
			int[] fir = new int [4];
			for(int j = 0 ; j < 4 ; j++){
				fir[j] = don[index];
				index++;
			}
			Arrays.sort(fir);
			System.out.println(fir[1] +" ");

		}

	}

}

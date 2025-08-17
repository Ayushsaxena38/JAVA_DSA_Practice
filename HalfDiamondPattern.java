
package fundamentals;
import java.util.Scanner;
public class HalfDiamondPattern {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println('*');
//		For Upper Half of the Pattern
		for(int i = 1;i<=n;i++) {
			
			System.out.print('*');
			
			for(int j = 1; j<=i ; j++) {
				
				System.out.print(j);
			}
			
			for(int j = (i-1); j>0 ; j--) {
				
				System.out.print(j);
				
			}
			
			System.out.print('*');
			System.out.println();
		}
		
//		For Lowwer Half of the Pattern
		
		for(int i = 1; i<n; i++) {
			System.out.print('*');
			for (int j = 1; j<(n-i+1); j++) {
				
				System.out.print(j);
				
			}
			for(int j = (n- i -1); j>0; j--) {
				
				System.out.print(j);
				
			}
			System.out.print('*');
			System.out.println();
		}
		System.out.print('*');

	}

}

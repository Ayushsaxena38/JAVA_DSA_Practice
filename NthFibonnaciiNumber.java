package fundamentals;
import java.util.Scanner;
public class NthFibonnaciiNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fn = 0;
		int sn = 1;
		int tn = 1;
		for(int i = 1;i<n;i++) {
			if (n>=1) {
				tn = fn + sn;
			}
			fn = sn;
			sn = tn;
		}
		
		System.out.println(tn);
				

	}

}

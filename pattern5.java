package fundamentals;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = n;
		int i = 1;
		while(i<=n) {
			int m = (p-i+1);
			int j = 1;
			while(j<=i) {
			System.out.print(m);
			m=m+1;
			j=j+1;
			}
		System.out.println();
		i=i+1;
		}
	
	}

}

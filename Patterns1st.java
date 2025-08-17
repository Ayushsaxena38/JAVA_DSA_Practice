package fundamentals;
import java.util.Scanner;
public class Patterns1st {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int j, n;
		n = s.nextInt();
		j = 1;
		while(j<=n) {
			int i = 1;
			while(i<=n) {
				System.out.print('*');
				i += 1;
			}
			System.out.println();
			j += 1;
		}

	}

}

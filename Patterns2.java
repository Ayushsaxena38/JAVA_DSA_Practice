package fundamentals;
import java.util.Scanner;
public class Patterns2 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int i, n;
		n = s.nextInt();
		i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print(i);
				j += 1;
			}
			System.out.println();
			i += 1;
		}

	}

}

package fundamentals;
import java.util.Scanner;
public class Patterns3 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int i, n;
		n = s.nextInt();
		i = 1;
		while(i<=n) {
			int j = n;
			while(j>=0) {
				System.out.print(j);
				j -= 1;
			}
			System.out.println();
			i += 1;
		}

	}

}

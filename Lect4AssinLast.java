package fundamentals;
import java.util.Scanner;
public class Lect4AssinLast {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, x, i, m;
		n = s.nextInt();
		x = s.nextInt();
		m=1;
		i = 1;
		while(i<=x){
			m = m*n;
			i+=1;
		}
		System.out.print(m);

	}

}

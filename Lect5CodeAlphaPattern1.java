package fundamentals;
import java.util.Scanner;
public class Lect5CodeAlphaPattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char ch = 'A';
		int k = ch;
		int i = 1;
		while(i<=n){
			int j = 1;
			while(j<=i){
				System.out.print((char)(k));
				j+=1;
			}
			k+=1;
			System.out.print("\n");
			i+=1;
		}

	}
}

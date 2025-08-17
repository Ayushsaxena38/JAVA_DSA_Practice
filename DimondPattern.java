package fundamentals;
import java.util.Scanner;
public class DimondPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = (n/2);
		int p = (m+1);
		int i = 1;
		while(i<=p) {
			int sp = i;
			while(sp<=m) {
				System.out.print(' ');
				sp+=1;
			}
			int j = 1;
			while(j<=i) {
				System.out.print('*');
				j+=1;
			}
			j = 2;
			while(j<=i) {
				System.out.print('*');
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		int b = 1;
		while(b<=m) {
			int sp = 1;
			while(sp<=b){
				System.out.print(' ');
				sp += 1;
			}
			int j = b;
			while(j<m){
				System.out.print('*');
				j = j+1;
			}
			j = b;
			while(j<p) {
				System.out.print('*');
				j += 1;
			}
			System.out.println();
			b +=1;
		}


	}


}




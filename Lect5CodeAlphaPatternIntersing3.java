package fundamentals;
import java.util.Scanner;
public class Lect5CodeAlphaPatternIntersing3 {

	public static void main(String[] args) {
//		toughest pattern i have ever seen
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char ch = 'A';
        int k = ch;
        int q = k+n-1;
        int i = 1;
        while(i<=n){
            int g = (q-i+1);
			int j = 1;
        	while(j<=i){
                System.out.print((char)(g));
                g+=1;
                j+=1;
            }
            System.out.print("\n");
            i+=1;
        }

	}
}

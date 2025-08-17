package fundamentals;
import java.util.Scanner;

public class ConvertFernheitToCelcius {

	public static void main(String[] args) {
		int S , E , W , C , F, i;
		Scanner se = new Scanner(System.in);
		S = se.nextInt();
		E = se.nextInt();
		W = se.nextInt();
		F = S;
		C = ((F-32)*5)/9;
		i=F;
		while(i<=E) {
			System.out.print(i+"  ");
			C = ((i-32)*5)/9;
			System.out.println(C);
			i += W;
		}

	}

}

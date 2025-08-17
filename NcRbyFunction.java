package fundamentals;
import java.util.Scanner;

public class NcRbyFunction {

public static int Fact(int num) {
	int fact = 1;
	for(int i = 1; i<= num ;i++) {
		fact = fact*i;
	}
	return fact;
}




	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int factn = Fact(n);
		int factr = Fact(r);
		int factnr = Fact(n-r);
		int NcR = factn/(factr *factnr);
		System.out.println(NcR);
		

	}

}

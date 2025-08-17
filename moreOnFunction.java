package fundamentals;
import java.util.Scanner;

public class moreOnFunction {

public static int Sum(int num1, int num2) {
	int sum = num1 + num2;
	
	return sum;
}




	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		System.out.println(Sum(n,r));
		

	}

}

package fundamentals;
import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		int n , i =0;
		int sum =0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while(i<=n) {
			sum = sum+i;
			System.out.println(sum);
			i = i+1;
		}
		System.out.println("sum of 0 to " + n + " numbers are: " + sum);
	}

}

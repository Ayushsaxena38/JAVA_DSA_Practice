package fundamentals;
import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		if(a>b) {
			System.out.println("first num is grator");
		}else if(b>a) {
			System.out.println("Second num is grator");
		}else {
			System.out.println("Both are equal");
		}

	}

}

package classesAndObjects;
import java.util.Scanner;
public class example {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the number to find the square root");
		System.out.println();
		int i =s.nextInt();
		Calculator a = new Calculator(i);
		System.out.println();
		System.out.println("Square root of "+ a.i + " is : " +a.x);

	}

}

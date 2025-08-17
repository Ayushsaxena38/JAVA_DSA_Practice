package fundamentals;

import java.util.Scanner;

public class leapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Year to check :");
		int y = s.nextInt();
		if(y%4 == 0) {
			System.out.print(y+" is a leap Year");
		}else {
			System.out.print(y+" is not a leap Year");
		}
	}

}

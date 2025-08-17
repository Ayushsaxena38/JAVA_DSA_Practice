package fundamentals;
import java.util.Scanner;
public class CheckPrimeByReturn {

	public static void main(String[] args) {
int j = 10;
		
	
		int a, i;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		i=2;
		while(i<a) {
			if(a%i==0) {
				System.out.println("Not Prime or Composite");
				return; // return will stop the program 
			}
			i = i + 1;
		}

		System.out.println("It is a Prime Number");
		System.out.println(j);
		

	}
//
}

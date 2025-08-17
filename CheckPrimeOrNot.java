package fundamentals;
import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
//		Scanner s=new Scanner (System.in);
//		int n=s.nextInt();
//		boolean isprime=true;
//		if(n%2==0)
//			isprime=false;
//		int i=3;
//		while(isprime&&i<n)
//		{
//			isprime=!(n%i==0);
//			i+=2;
//		}
//		if(isprime)
//		{
//			System.out.println("Prime");
//		}
//		else
//		{
//			System.out.println("Composite");
//		}

				Scanner s = new Scanner(System.in);
				int n, i, f;
				f = 0;
				i = 2;
				n = s.nextInt();
				while(i<n) {
					if(n%i==0) {
						f=1;
					}
					i = i+1;
				}
				if(f==0) {
					System.out.println("It is a Prime number");
				}else {
					System.out.println("Not a Prime number");
				}

	}

}

package fundamentals;

import java.util.Scanner;

public class ProbabilityQuesByFunction {
	public static double fact(int a){
		double fact = 1;
		int i = 1;
		for (; i<=a ; i++){
			fact = fact * i;
		}
		return fact;
	}

	public static int probability(int n,int x){
		// first calculate NcR
		double s = (fact(8))/(fact(n)*fact(8-n));
		double e = ((fact(4)/(fact(x)*fact(4-x)))*(fact(4)/(fact(n-x)*fact(4-(n-x)))));
		int res = (int)((e/s)*100);
		return res;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		System.out.print(probability(n,x));
	}
	

}

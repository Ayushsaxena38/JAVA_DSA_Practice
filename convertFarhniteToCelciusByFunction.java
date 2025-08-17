package fundamentals;
import java.util.Scanner;
public class convertFarhniteToCelciusByFunction {
	public static void printFahrenheitTable(int start, int end, int step) {
        int C, F;
		F = start;
		C = ((F-32)*5)/9;
		int i=F;
		while(i<=end) {
			System.out.print(i+"  ");
			C = ((i-32)*5)/9;
			System.out.println(C);
			i += step;
		}

	}
	public static void main(String[] args){
    	int start , end , step ;
		Scanner se = new Scanner(System.in);
		start = se.nextInt();
		end = se.nextInt();
		step = se.nextInt();
        printFahrenheitTable(start ,end , step);
		

	}

}

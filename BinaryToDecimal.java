package fundamentals;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void toDecimal(int n) {
		int[] binary = new int[32];
		int index = 0;
		while(n>0) {
			binary[index] = n%2;
			n = n/2;
			index++;
		}
		for(int i = index-1 ; i>=0 ; i--) {
			System.out.print(binary[i] +" ");
		}
		
	}
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		int n = input.nextInt();
//		String binaryString =input.nextLine();
//		System.out.println(Integer.parseInt(binaryString,2));
		toDecimal(n);
	}


}

package fundamentals;
import java.util.Scanner;
public class LargestNumberInArray {
	
	public static int largestnum(int arr[]) {
		int n = arr.length;
		int a = arr[0];
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i<n ; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

	public static void main(String[] args) {
		// first we need to store array by taking input
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length of Array");
		int n = s.nextInt();
		System.out.println("enter the values in Array");
		int arr[] = new int[n];
		for(int i = 0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print(largestnum(arr));
	}

}

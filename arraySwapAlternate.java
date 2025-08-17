package fundamentals;

import java.util.Scanner;

public class arraySwapAlternate {
	public static int [] inputArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length of Array");
		int n = s.nextInt();
		System.out.println("enter the values in Array");
		int arr[] = new int[n];
		for(int i = 0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void swapAlternElement(int [] arr) {
		int n = arr.length;
        for(int i = 0 ; i< n-1 ; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
	}
	
	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int [] arr = inputArray();
		swapAlternElement(arr);
		printArray(arr);
		

	}

}

package fundamentals;

import java.util.Scanner;

public class PushAllZerosAtEndBestMethod {

	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void pushZerosAtEnd(int[] arr) {
    	int n = arr.length;
    	int k = 0;
        for(int i = 0 ; i < n ; i++){
           if(arr[i] != 0 ) {
        	   arr[k] = arr[i];
        	   k++;
           }
        }
        while(k<n) {
        	arr[k] = 0;
        	k++;
        }
	}

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

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr = inputArray();
		pushZerosAtEnd(arr);
		printArray(arr);


	}



}

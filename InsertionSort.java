package fundamentals;

import java.util.Scanner;

public class InsertionSort {

	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void insertionSort(int[] arr) {

		int n = arr.length;
		for(int i = 1 ; i < n ; i++){
			int temp = arr[i];
			int j= i-1; 
			while(j>=0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}                                           

			arr[j+1] = temp;
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
		insertionSort(arr);
		printArray(arr);


	}



}

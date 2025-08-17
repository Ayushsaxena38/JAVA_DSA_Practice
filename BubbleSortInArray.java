package fundamentals;

import java.util.Scanner;

public class BubbleSortInArray {
	
	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void bubbleSort(int[] arr){
    	int n = arr.length; 
        for(int i = 0 ; i<n-1 ; i++){
            for(int j = 0 ; j < (n-i-1) ; j++){
                if(arr[j]>arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
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
		bubbleSort(arr);
		printArray(arr);
		
		
	}
	
		

}

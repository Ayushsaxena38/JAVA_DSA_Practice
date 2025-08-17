package fundamentals;

import java.util.Scanner;

public class PushAllZerosAtEndMyMethod {

	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void pushZerosAtEnd(int[] arr) {
    	int n = arr.length;
    	
        for(int i = 0 ; i < n ; i++){
            int c = i;
            if(arr[i] == 0){
                for(int j = i+1 ; j<n ; j++){
                    if(arr[j] != 0){
                        c = j;
                        break;
                    }
                    // int t = arr[c];
                    // arr[c] = arr[i];
                    // arr[i] = t;
                }
                 int t = arr[c];
                    arr[c] = arr[i];
                    arr[i] = t;
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
		pushZerosAtEnd(arr);
		printArray(arr);


	}



}

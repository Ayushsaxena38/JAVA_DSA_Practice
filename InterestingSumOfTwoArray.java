package fundamentals;

import java.util.Scanner;

public class InterestingSumOfTwoArray {
	
	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
    
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        int k = Math.max(arr1.length, arr2.length); //k is the last index of output array.
        while(i>=0 && j>=0){
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum%10;
            carry = sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            int sum = arr1[i]+carry;
            output[k] = sum%10;
            carry = sum/10;
            i--;
            k--;
        }
        while(j>=0){
            int sum = arr2[j]+carry;
            output[k] = sum%10;
            carry = sum/10;
            j--;
            k--;
        } 
        output[0]=carry;
    }
	
//	public static int[] merge(int arr1[], int arr2[]) {
//        int m = arr1.length;
//        int n = arr2.length;
//        int [] arr = new int[m+n];
//        int i = 0 , j = 0 , k = 0;
//        while(i < m && j < n){
//            if(arr1[i] <= arr2[j]){
//                arr[k] = arr1[i];
//                i++;
//                k++;
//            }else{
//                arr[k] = arr2[j];
//                j++;
//                k++;
//            }
//        }
//            
//            while(i < m ) {
//            	arr[k] = arr1[i];
//            	i++;
//            	k++;
//            }
//            while(j < n) {
//            	arr[k] = arr2[j];
//            	j++;
//            	k++;
//            }
//            return arr;
//
//        }

	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]);
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
		int [] arr1 = inputArray();
		int [] arr2 = inputArray();
		int n = arr1.length;
		int m = arr2.length;
		int []res = new int[n+m];
		sumOfTwoArrays(arr1,arr2,res);
		printArray(res);


	}



}

package fundamentals;

import java.util.Scanner;

public class binarySearchInSortedArray {
	
	 public static int binarySearch(int[] arr, int x) {
	    	int n = arr.length;
	        int m = 0;
	        int s = 0;
	        int e = n-1;
	        for( ; e >= s ; ){
	            m = (s+e)/2;
	            if(arr[m] == x){
	                return m;
	            }else if(arr[m] > x){
	                e = m-1;
	            }else{
	                s = m+1;
	            }
	        }
	        return -1;
	    

	}
	
	
//	public static void sortZeroesAndOne(int[] arr) {
//		int r = 0 ;
//		int l = arr.length - 1 ;
//		for(  ; r<l ; ){
//			if(arr[r] == 1){
//				if(arr[l] == 0){
//					int t = 0;
//					t = arr[r];
//					arr[r] = arr[l];
//					arr[l] = t;
//
//				}
//				l--;
//			}else{
//				r++;
//			}
//		}
//	}

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
		int [] arr1 = inputArray();
		System.out.println("enter the element to find in Array");
		int x = s.nextInt();
		System.out.println(binarySearch(arr1 , x));
		
//		for(int i = 0; i < arr1.length ; i++) {
//			System.out.print(arr1[i]);
		}


	

}

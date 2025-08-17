package fundamentals;

import java.util.Scanner;

public class IntersectionOfTwoArrays {
	public static void intersections(int arr1[], int arr2[]) {
		int n = arr1.length;
        int m = arr2.length;
        
        
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
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
		int [] arr1 = inputArray();
		int [] arr2 = inputArray();
		intersections(arr1,arr2);
		

	}

}

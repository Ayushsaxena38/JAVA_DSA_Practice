package fundamentals;

import java.util.Scanner;

public class findUniqueInArray {
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
	
	public static int findUnique(int[] arr){
        int n = arr.length;
		int c = 0;
        for(int i = 0 ; i < n ; i++){
            c = 0;
            for(int j = 0 ; j < n ; j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            if( c == 1){
                return arr[i];
            }
    }
        return arr[0];
	}

	public static void main(String[] args) {
		int [] arr = inputArray();
		int u = findUnique(arr);
		System.out.println(u);
		

	}

}

package fundamentals;

import java.util.Scanner;

public class linearSearch {
	public static int linearsearch(int arr[], int x) {
        //Your code goes here
        int n = arr.length;
        int index = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
               index=i;
               break;
            }
        }
        return index;
    }
	public static int[] abc(int size) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[size];
		for(int i = 0 ; i<size ; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = abc(size);
		int target = s.nextInt();
		System.out.print(linearsearch(arr,target));
		

	}

}

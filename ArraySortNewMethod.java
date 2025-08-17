package fundamentals;

import java.util.Scanner;

public class ArraySortNewMethod {
	public static char[] sortArrays(char[] arr)
    {

        
        int length = arr.length;

        // Sorting using a single loop
        for (int j = 0; j < arr.length - 1; j++) {

           
            int d1 = arr[j];
            int d2 = arr[j + 1];

            // Comparing the ascii code.
            if (d1 > d2) {

                // Swapping of the characters
                char temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j -=1;
            }
        }

        return arr;
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
//		int [] arr1 = inputArray();
		char [] ar2 = {'a' ,'b' , 'c' ,'d' ,'f' };
		System.out.println(sortArrays(ar2));


	}

}

package fundamentals;
import java.util.Scanner;
public class findingElementInArrayByLinearSearch {
	
	 public static int linearSearch(int arr[], int x) {
			int n = arr.length;
	        for(int i = 0 ; i<n ; i++){
	            if(arr[i] == x){
	                return i;
	            }
	    	}
	        return -1;
	    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length of Array");
		int n = s.nextInt();
		System.out.println("enter the values in Array");
		int arr[] = new int[n];
		for(int i = 0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print("enter the element");
		int x = s.nextInt();
		
		System.out.print(linearSearch(arr,x));
	}

}

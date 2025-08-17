package Priority_Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class kLargestElements {
	public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0 ; i<k ;i++){
			pq.add(input[i]);
		}
		for(int i = k ;  i < input.length; i++){
			if(pq.element() < input[i]){
				pq.poll();
				pq.add(input[i]);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 0 ; i<k; i++){
			ans.add(pq.poll());
		}
		return  ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,8,5,4,3};
		ArrayList<Integer> a = kLargest(arr, 3);
		for(int i = 0; i < 3; i++) {
			System.out.println(a.get(i));
		}

	}

}

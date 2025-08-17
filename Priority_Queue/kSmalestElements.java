package Priority_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class kSmalestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2 ,12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		ArrayList<Integer> a = kSmallest(arr, 4);
		for(int i = 0; i < 3; i++) {
			System.out.println(a.get(i));
		}
	}

	public static ArrayList<Integer> kSmallest(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0 ; i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i = k ; i<arr.length;i++) {
			if(pq.peek() > arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while(!pq.isEmpty()) {
			ans.add(pq.poll());
		}
		return ans;
	}

}

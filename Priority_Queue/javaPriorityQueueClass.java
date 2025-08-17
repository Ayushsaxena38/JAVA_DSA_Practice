package Priority_Queue;

import java.util.PriorityQueue;

public class javaPriorityQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		System.out.println(pq.element());//it throws an exception if queue is empty it is used for getting peek in the queue;
		System.out.println(pq.poll());//it returns null if queue is empty it is used for removing the element from queue;
		System.out.println(pq.remove(38));
		int[] arr= {4,7,3,2,8,9,6,1};
		for(int i = 0 ; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		
		System.out.println(pq.peek());
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.println(pq.poll());
		}
	}

}

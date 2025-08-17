package Priority_Queue;

import java.util.ArrayList;

public class PQ_max<T>{
	private ArrayList<Element<T>> heap;
	
	public PQ_max() {
		heap = new ArrayList<>();
	}
	// size function
	public int size() {
		return heap.size();
	}
	// isEmpty function
	public boolean isEmpty() {
		return heap.size() == 0;
	}
	// getMax function
	public T getMax() {
		return heap.get(0).value;
	}
	//insert function
	public void insert(T value, int priority) {
		Element<T> ne = new Element<>(value , priority);
		if(isEmpty()) {
			heap.add(ne);
			return;
		}
		heap.add(ne);
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		//Up heapify
		while(parentIndex >= 0) {
			if(heap.get(childIndex).priority > heap.get(parentIndex).priority) {
				// swap
				Element<T> temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}else {
				return;
			}
		}
		return;
	}
	// delete function
	public T remove() throws PriorityQueueEmptyExcetion {
		if(isEmpty()) {
			throw new PriorityQueueEmptyExcetion();
		}
		if(heap.size() == 1) {
			return heap.remove(0).value;
		}
		T ans = heap.get(0).value;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentIndex = 0;
		int left = 1;
		int right = 2;
		int maxIndex = parentIndex;
		 // down Heapify;
		while(left < heap.size()) {
			if(heap.get(left).priority > heap.get(maxIndex).priority) {
				maxIndex = left;
			}
			if(right < heap.size() && heap.get(right).priority > heap.get(maxIndex).priority) {
				maxIndex = right;
			}
			if(maxIndex == parentIndex) {
				return ans;
			}
			// swap 
			Element<T> temp = heap.get(maxIndex);
			heap.set(maxIndex, heap.get(parentIndex));
			heap.set(parentIndex,temp);
			// calculate new child indexes 
			parentIndex = maxIndex;
			left = (parentIndex*2)+1;
			right = (parentIndex*2)+2;
			
		}
		return ans;
	}
	

}

package Priority_Queue;

import java.util.ArrayList;

public class PQ_min<T> {
	private ArrayList<Element<T>> heap;
	
	public PQ_min() {
		heap = new ArrayList<>();
	}
	
	// size function;
	public int size() {
		return heap.size();
	}
	// isEmpty function;
	public boolean isEmpty() {
		return heap.size() == 0;
	}
	// getMin;
	public T getMin() {
		return heap.get(0).value;
	}
	// insert function;
	public void insert(T value , int priority) {
		Element<T> ne = new Element<>(value,priority);
		if(heap.isEmpty()) {
			heap.add(ne);
			return;
		}
		heap.add(ne);
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		while(parentIndex >= 0) {
			if(heap.get(childIndex).priority<heap.get(parentIndex).priority) {
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
	// deletMin function;
	public T remove() throws PriorityQueueEmptyExcetion {
		if(isEmpty()) {
			throw new PriorityQueueEmptyExcetion();
		}
		if(heap.size() == 1 || heap.size() == 2) {
			return heap.remove(0).value;
		}
		T ans = heap.get(0).value;
		// put last element in 0 th index and remove last element;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int maxIndex = 0;
		int minIndex = 0;
		int left = 1;
		int right = 2;
		while(left < heap.size()) {
			//find the minimum priority index;
			if(heap.get(left).priority < heap.get(minIndex).priority) {
				minIndex = left;
			}
			if(right < heap.size() && heap.get(right).priority<heap.get(minIndex).priority) {
				minIndex = right;
			}
			
			if(minIndex == maxIndex) {
				break;
			}
			// swap the minIndex and maxIndex;
			Element<T> temp = heap.get(maxIndex);
			heap.set(maxIndex, heap.get(minIndex));
			heap.set(minIndex, temp);
			maxIndex = minIndex;
			left = (minIndex*2)+1;
			right = (minIndex*2)+2;
		}
		return ans;
		
	}
}

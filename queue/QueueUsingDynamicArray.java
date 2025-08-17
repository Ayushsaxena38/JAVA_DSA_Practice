package queue;
public class QueueUsingDynamicArray {
	private int [] data;
	private int size;
	private int front;
	private int rear;
	
	public QueueUsingDynamicArray() {
		data = new int[5];
		size = 0;
		front = -1;
		rear = -1;
	} 
	public QueueUsingDynamicArray(int capacity) {
		data = new int[capacity];
		size = 0;
		front = -1;
		rear = -1;
	} 
	
	private void doubleCapacity() {
		int [] t = data;
		data = new int[2*t.length];
		int index = 0;
		for(int i = front ; i < t.length ; i++) {
			data[index++] = t[i];
		}
		for(int i = 0; i < front ; i++) {
			data[index++] = t[i];
		}
		
		
	}
	
	public void enqueue(int ele) {
		if(size == data.length) {
			doubleCapacity();
		}
		rear = (rear+1)%data.length;
		data[rear] = ele;
		size++;
		if(front == -1) {
			front++;
		}
	}
	
	public int dequeue() throws QueueIsEmptyExceptio {
		if(size == 0) {
			throw new QueueIsEmptyExceptio();
		}
		int delet = data[front];
		front = (front +1)%data.length;
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		
		return delet;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public int front() {
		return data[front];
	}
	
	
	
	
	
	
	
	
	
}

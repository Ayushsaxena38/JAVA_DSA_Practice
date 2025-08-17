package queue;

public class QueueUsingArray {
	
	private int data[];
	private int size;
	private int front;
	private int rear;
	
	public QueueUsingArray() {
		data = new int[5];
		front = -1;
		rear = -1;
		size = 0;
	}
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1 ;
		rear = -1;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int front() throws QueueIsEmptyExceptio {
		if(front == -1) { 
			// Throw error
			QueueIsEmptyExceptio e = new QueueIsEmptyExceptio();
			throw e;
		}
		return data[front];
	}
	
	public void enqueue(int ele) throws QueueFullException {
		if(size == data.length) {
			throw new QueueFullException();
		}
		rear = (rear + 1 )%data.length;
		data[rear] = ele;
		size++;
		if(front == -1) {
			front++;
		}
	}
	
	public int dequeue() throws QueueIsEmptyExceptio {
		if(size==0) {
		QueueIsEmptyExceptio e = new QueueIsEmptyExceptio();
		throw e;
		}else {
			int delet = data[front];
			front = (front+1)%data.length;
			size--;
			if(size == 0) {
				front = -1;
				rear = -1;
			}
			return delet;
		}
	}
	
	
	
	

}

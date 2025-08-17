package queue;

import LinkedList.Node;

public class QueueUsingLL<T> {
	Node<T> front;
	Node<T> rear;
	int size;

	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	public T dequeue() throws QueueIsEmptyExceptio {
		if(size == 0) {
			throw new QueueIsEmptyExceptio();
		}
		T delet = front.data;
		if(size == 1) {
			front = null;
			rear = null;
		}else if(size >1) {
			front = front.next;
		}
		size--;
		return delet;
	}

	public void enqueue(T ele ) {
		Node<T> ne = new Node<>(ele);
		if(size == 0) {
			front = ne;
			rear = ne;
		}else {
			rear.next = ne;
			rear = rear.next;
		}
		size++;
	}

	public T front() {
		T f = front.data;
		return f;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}




}

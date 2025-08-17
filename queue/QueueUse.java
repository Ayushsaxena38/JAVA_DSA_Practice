package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueIsEmptyExceptio {
//		QueueUsingDynamicArray a = new QueueUsingDynamicArray();
//		QueueUsingLL<Integer> a = new QueueUsingLL<>();
		QueueUsing2Stacks a = new QueueUsing2Stacks();
		a.enqueue(10);
		System.out.println(a.front());
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		System.out.println(a.size());
		while(!a.isEmpty()) {
			System.out.println(a.dequeue());
		}
		System.out.println(a.isEmpty());
		
		

	}

}

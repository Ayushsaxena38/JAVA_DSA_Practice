package queue;

import java.util.Stack;

public class QueueUsing2Stacks {
	Stack<Integer> s1;
	Stack<Integer> s2;
	int size;
	
	public QueueUsing2Stacks() {
		s1 = new Stack<>();
		s2 = new Stack<>();
		size = 0;
	}
	
	public void enqueue(int ele) {
		s1.push(ele);
		size++;
	}
	public int dequeue() throws QueueIsEmptyExceptio {
		if(size == 0) {
			throw new QueueIsEmptyExceptio();
		}
		while(s1.size() > 1) {
			s2.push(s1.pop());
		}
		int del = s1.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
		size--;
		return del;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}
	public int front() throws QueueIsEmptyExceptio {
		if(size == 0) {
			throw new QueueIsEmptyExceptio();
		}
		while(s1.size() > 1) {
			s2.push(s1.pop());
		}
		int front = s1.peek();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return front;
		
	}
	
	
	
	
	
	
}

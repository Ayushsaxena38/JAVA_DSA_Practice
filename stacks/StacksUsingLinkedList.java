package stacks;

import LinkedList.Node;

public class StacksUsingLinkedList<T> {
	
	private Node<T> head;
	private int size;
	public StacksUsingLinkedList(){
		head = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public void push(T ele) {
		Node<T> t = new Node<T>(ele);
//		if(head == null) {
//			head = t;
//		}else {
//			Node<T> s = head;
//			head = t;
//			head.next = s;
//		}
		t.next = head;
		head = t;
		size++;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public T pop() {
		T t = head.data;
		head = head.next;
		size--;
		return t;
	}
	public T top() {
		T te = head.data;
		return te;
	}

}

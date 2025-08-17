package stacks;

import java.util.Stack;

public class StacksUsingArray {

	private int data[];
	private int topIndex;
	private int nextElementIndex;
	public StacksUsingArray() {
		 data = new int[5];
		nextElementIndex = 0;
		topIndex = -1;
	}
	public StacksUsingArray(int size) {
		data = new int[size];
		nextElementIndex = 0;
		topIndex = -1;
	}
	
	private void doubleCapacity() {
		System.out.println("DoubleCapacity");
		int [] t = data;
		data = new int[2*t.length];
		for(int i = 0 ; i < t.length ; i++) {
			data[i] = t[i];
		}
		return;
	}

//O(1) time
	public void push(int a) {
		if(nextElementIndex >= data.length ) {
			doubleCapacity();
			// Throw error stack full error
//			 StackFullException e = new StackFullException();
//			 throw e;
			}
		data[nextElementIndex] = a;
		nextElementIndex++;
		topIndex++;
	}
//O(1) time
	public int pop(){
		if(topIndex == -1) {
			System.out.println("Stack is Already empty");
			//throw stack is empty Exception
//			throw new StackIsEmptyException();
			return -1 ;
		}
		int a = data[nextElementIndex-1];
		data[nextElementIndex-1] = 0;
		nextElementIndex--;
		topIndex--;
		return a;
	}
//O(1) time
	public int size() {
		return nextElementIndex;
	}
//O(1) time
	public int top(){
		if(topIndex == -1) {
			//throw stack is empty Exception
//			throw new StackIsEmptyException();
			System.out.println("Stack is Empty so no element to pop");
			return -1;
		}
		return data[topIndex];

	}
//O(1) time
	public boolean isEmpty() {
		if(topIndex == -1 || nextElementIndex == 0) {
			return true;
		}
		return false;
	}


}

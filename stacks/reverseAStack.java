package stacks;

import java.util.Stack;

public class reverseAStack {

	public static void insertAtBottom(int a , Stack<Integer> input , Stack<Integer> extra) {
		if(input.isEmpty()) {
			input.push(a);
			return;
		}
		while(!input.isEmpty()) {
			extra.push(input.pop());
		}
		input.push(a);
		while(!extra.isEmpty()) {
			input.push(extra.pop());
			
		}
		return;

	}

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if(input.isEmpty()) {
			return;
		}
		int x = input.pop();
		reverseStack(input, extra);
		insertAtBottom(x,input,extra);
		return;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> a = new Stack<>();
		Stack<Integer> h = new Stack<>();
		int arr[] = {2 , 3 , 4 , 5};
		for(int i = 0 ; i < arr.length; i++) {
			a.push(arr[i]);
		}
		reverseStack(a, h);
		while(!a.isEmpty()) {
			System.out.println(a.pop());
		}
	}
}

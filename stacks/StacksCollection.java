package stacks;

import java.util.Stack;



public class StacksCollection {
	
	  public static boolean isBalanced(String expression) {
	        //Your code goes here
	        String brO = "[{(";
	        String brC = "}])";
	        Stack<Character> s = new Stack<>();
	        for(int i = 0 ; i < expression.length(); i++){
	        	String p = new String();
	        	p+=expression.charAt(i);
	            if(s.isEmpty() && brO.contains(p)){
	                s.push(expression.charAt(i));
	            }else if(s.isEmpty() == false && (expression.charAt(i-1) == s.peek())){
	                s.pop();
	            }else if(brO.contains(p)){
	                s.push(expression.charAt(i));
	            }

	        }
	        return s.isEmpty();

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7};
		Stack<Integer> stack = new Stack<>();
//		stack.push(10);
		for(int ele : arr) {
			stack.push(ele);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		stack.push(20);
		System.out.print(stack.peek());
		Stack<Character> s = new Stack<>();
		String w = "()((())())";
		System.out.println(isBalanced(w));
		
		}

}

package stacks;

public class stacksUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StacksUsingArray stack = new StacksUsingArray();
			stack.push(10);
			stack.push(20);
			stack.push(48);
			stack.push(25);
			stack.push(33);
			stack.push(44);
			stack.push(49);
			stack.push(99);
			stack.push(75);
			stack.push(59);

			//		stack.pop();
			System.out.println(stack.size());
			System.out.println(stack.top());
			System.out.println(stack.pop());
			System.out.println(stack.size());
			stack.push(58);
			
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());
			}
			

		}
	}

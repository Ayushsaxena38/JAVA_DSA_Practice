package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueInJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> p = new LinkedList<>();
		Stack<Integer> s =new Stack<>();
		s.push(10);
		s.push(2);
		p.add(10);
		p.add(2);
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(2);
		q.add(3);
		System.out.println(s.pop());
		int [] arr = {10,2};
		System.out.println(q.retainAll(s));
//		while(!q.isEmpty()) {
//			
//			System.out.println(q.());
//		}

	}

}

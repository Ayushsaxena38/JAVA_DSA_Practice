package LinkedList;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	
}

public class reverseRecursionBatter {
	
	public static DoubleNode reverseRBetter(Node<Integer> head) {
		if(head == null || head.next == null) {
			DoubleNode a = new DoubleNode();
			a.head = head;
			a.tail = head;
			return a;
		}
		DoubleNode sa = reverseRBetter(head.next);
		sa.tail.next = head;
		head.next = null;
		DoubleNode oa = new DoubleNode();
		oa.head = sa.head;
		oa.tail = head;
		return oa;
	}
	
	
	
	public static Node<Integer> takeInputON(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while(data != -1) {
			Node<Integer> cn = new Node<>(data);
			if(head == null) {
				head = cn;
				tail = cn;
			}else {
				tail.next = cn;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.println(head.data);
		
		printR(head.next);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInputON();
		DoubleNode ll = reverseRBetter(head);
		printR(ll.head);

	}

}

package LinkedList;

import java.util.Scanner;

public class reverseRBestMethod {
	
	public static Node<Integer> reverseRBest(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallAns = reverseRBest(head.next);
		Node<Integer> tail = head.next;
		tail.next = head;
		head.next = null;
		return smallAns;
	}
	
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.println(head.data);
		
		printR(head.next);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInputON();
		Node<Integer> ll = reverseRBest(head);
		printR(ll);

	}

}

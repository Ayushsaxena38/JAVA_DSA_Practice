package LinkedList;

import java.util.Scanner;

public class printLinkedListByRecrusion {
	
	public static void printByR(Node<Integer> head) {
		if(head == null) {
			return ;
		}
		printByR(head.next);
		System.out.println(head.data);
		
	}
	
	public static Node<Integer> TakeInput(){
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
		Node<Integer> head = TakeInput();
		printByR(head);

	}

}

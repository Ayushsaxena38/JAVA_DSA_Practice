package LinkedList;

import java.util.Scanner;

public class insertNodeByRecrusion {
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
	
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.println(head.data);
		
		printR(head.next);
	}
	
	public static Node<Integer> insert(Node<Integer> head, int i , int j){
		if(i == 0) {
			Node<Integer> t = new Node<>(j);
			t.next = head;
			head = t;
			return head;
		}
		if(head == null) {
			return head;
		}
		
		
		Node<Integer> t = insert(head.next , i-1 ,j);
		head.next = t;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = TakeInput();
		head = insert(head , 7 , 25);
		printR(head);
		
	}

}

package LinkedList;

import java.util.Scanner;

public class insertNodeAtiThPosition {
	
	
	
	public static Node<Integer> insert(Node<Integer> head , int i){
		Scanner s  = new Scanner(System.in);
		if(i == 0) {
			Node<Integer> t = new Node<>(s.nextInt());
			t.next = head;
			head = t;
			
			return head;
		}
		
		Node<Integer> t = head;
		int count = 0;
		while(count != i-1 && t.next != null) {
			count++;
			t = t.next;
		}
		if(t.next == null) {
			return head;
		}
		Node<Integer> pre = t;
		t = t.next;
		Node<Integer> curr = new Node<>(s.nextInt());
		curr.next = t;
		pre.next = curr;
		return head;
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
	
	public static void print(Node<Integer> head){
	    Node<Integer> temp = head;
//	    print LL3
	    while(temp != null){
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInputON();
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		head = insert(head,i);
		print(head);
		
		
		
	}
	
}

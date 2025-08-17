package LinkedList;
import java.util.Scanner;
public class deletNode {
	
	public static void print(Node<Integer> head) {
		Node<Integer> t = head;
		while(t!=null) {
			System.out.println(t.data);
			t = t.next;
		}
	}
	
	public static Node<Integer> Delet(Node<Integer> head , int i){
		if(i == 0) {
			Node<Integer> t = head.next;
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
		t = t.next;
		pre.next = t;
		return head;
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
		System.out.println("which node you have to delet");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		head = Delet(head,i);
		print(head);
		
		
	}

}

package LinkedList;

public class reverseLL {
	static Node<Integer> nhead;
	public static void rev(Node<Integer> pre) {
		if(pre.next== null) {
			nhead = pre;
			return;
		}
		rev(pre.next);
		Node<Integer> curr = pre.next;
		curr.next = pre ;
		
	}
	
	
	
	public static Node<Integer> reverse(Node<Integer> head){
		if(head == null) {
			return head;
		}
		nhead= null;
		rev(head);
		head.next = null;
		return nhead;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(12);
		int [] arr = {1,2,3,4,5,6};
		int i = 0;
		Node<Integer> a = head;
		while(i<arr.length) {
			Node<Integer> temp = new Node<Integer>(arr[i]);
			a.next = temp;
			a = a.next;
			i++;
		}
		
		head = reverse(head);
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
			
		}
		
		
		
		
	}

}

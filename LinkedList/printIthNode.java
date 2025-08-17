package LinkedList;

public class printIthNode {
	public static void printIthNode(Node<Integer> head, int i){

		int count=0;
		Node<Integer> temp=head;
		while(count!=i && temp!=null)
		{
			temp=temp.next;
			count++;
		}
		if(count==i && temp!=null)
			System.out.println(temp.data);
	}

	public static void main(String[]args) {
		Node<Integer> n = new Node<>(-1);
		printIthNode(n, 0);
	}

}

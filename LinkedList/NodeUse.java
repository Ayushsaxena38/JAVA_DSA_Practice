package LinkedList;
import java.util.Scanner;
public class NodeUse {

	public static Node<Integer> creatLinkedlist(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		//create link between all nodes
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		// now return Head means first node
		return n1;

	}
	
	public static void incrementby1(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
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
		s.close();
		return head;
	}
	
	public static Node<Integer> takeInputON2(){
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> cn = new Node<>(data);
			if(head == null) {
				head = cn;
			}else{
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				// now connect the tail to next node
				tail.next = cn;
				
			}
			data = s.nextInt();
		}
		s.close();
		return head;
	}
	
	 public static void print(Node<Integer> head){
		    Node<Integer> temp = head;
//		    print LL3
		    while(temp != null){
		        System.out.print(temp.data +"-->");
		        temp = temp.next;
		        if(temp == null) {
		        	System.out.print("null");
		        }
		    }
		    System.out.println();
		}


	public static void main(String[] args) {
		Node<Integer> Head = takeInputON();//creatLinkedlist();
		//		System.out.println(n1);
		//		System.out.println(n1.data);
		//		System.out.println(n1.next);
//		System.out.println(Head.data);  //   print LL1
//		System.out.println(Head.next.data);//   print LL1
//		System.out.println(Head.next.next.data);//  print LL1
//		System.out.println(Head.next.next.next.data);  print LL1
//		incrementby1(Head);
		print(Head);

	}

}

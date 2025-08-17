package LinkedList;

public class Node<T> {//<T> is showing that it is a generic Node. i.e. you can create any type of node.
	public T data;
	public Node<T> next;
	public Node(T data){
		this.data = data;
//		next = null;
	}
}

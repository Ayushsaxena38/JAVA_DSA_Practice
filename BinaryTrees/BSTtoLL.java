package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

import LinkedList.Node;

public class BSTtoLL {
	static Node<Integer> head;
	static Node<Integer> tail;
	public static BinaryTree<Integer> takeInputLvlWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data of root");
		int rootData = s.nextInt();
		BinaryTree<Integer> root = new BinaryTree<>(rootData);
		Queue<BinaryTree<Integer>> a = new LinkedList<>();
		a.add(root);
		while(!a.isEmpty()) {
			BinaryTree<Integer> n = a.poll();
			System.out.println("Enter the data of left child of parent " + n.data);
			int l = s.nextInt();
			if(l != -1) {
				BinaryTree<Integer> left = new BinaryTree<>(l);
				n.left = left;
				a.add(left);
			}
			System.out.println("Enter the data of right child of parent " + n.data);
			int r = s.nextInt();
			if(r != -1) {
				BinaryTree<Integer> right = new BinaryTree<>(r);
				n.right = right;
				a.add(right);
			}
		}
		return root;
	}
	public static void helper(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		helper(root.left);
		Node<Integer> curr = new Node<>(root.data);
		if(head == null) {
			head = curr;
			tail = curr;
		}else {
			tail.next = curr;
			tail = tail.next;
		}
		helper(root.right);
		return;
		
	}
	
	public static Node<Integer> convertBstToLL(BinaryTree<Integer> root){
		helper(root);
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputLvlWise();
		Node<Integer> head = convertBstToLL(root);
		while(head!=null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

}

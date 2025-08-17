package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class levelWiseInputAndOutputInBinaryTree {
	
	public static void printLevelWise(BinaryTree<Integer> root) {
		//Your code goes here
		Queue<BinaryTree<Integer>> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			BinaryTree<Integer> front = q.poll();
			System.out.println(front.data);
			if(root.left != null){
				System.out.print(front.left.data + " ");
				q.add(front.left);
			}
			if(root.right!=null){
				System.out.print(front.right.data);
				q.add(front.right);
			}
			System.out.println();
		}
	}
	public static void printLvlWise(BinaryTree<Integer> root) {
		Queue<BinaryTree<Integer>> pendingChildren = new LinkedList<>();
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			BinaryTree<Integer> front = pendingChildren.poll();
			System.out.print(front.data + ":");
			if(front.left != null) {
				System.out.print("L:" + front.left.data + ",");
				pendingChildren.add(front.left);
			}else {
				System.out.print("L:-1,");
			}
			if(front.right!= null) {
				System.out.print("R:" + front.right.data);
				pendingChildren.add(front.right);
			}else {
				System.out.print("R:-1");
			}
			System.out.println();
			
		}
		
	}
	
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputLvlWise();
		printLevelWise(root);
		

	}

}

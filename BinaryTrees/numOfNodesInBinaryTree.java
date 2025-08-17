package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class numOfNodesInBinaryTree {
	
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
	
	public static int numNodes(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftNumNodes = numNodes(root.left);
		int rightNumNodes = numNodes(root.right);
		return 1 + leftNumNodes + rightNumNodes;
	}
	
	public static BinaryTree<Integer> takeInputBetter(boolean isRoot, int parent , boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root's data");
		}else {
			if(isLeft) {
				System.out.println("Enter Left child's data of parent " + parent);
			}else {
				System.out.println("Enter Right child's data of parent " + parent);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTree<Integer> root = new BinaryTree<>(rootData);
		BinaryTree<Integer> rootLeft = takeInputBetter(false, root.data, true);
		BinaryTree<Integer> rootRight = takeInputBetter(false, rootData, false);
		root.left = rootLeft;
		root.right = rootRight;
		return root;
		
	}
	
	public static void printTreeDetailed(BinaryTree root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");	
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static void main(String[]args) {
//		BinaryTree<Integer> root = takeInputBetter(true,0,true);
		BinaryTree<Integer> root = takeInputLvlWise();
		printTreeDetailed(root);
		System.out.println("Number of Nodes ="+ numNodes(root));
		
	}

}

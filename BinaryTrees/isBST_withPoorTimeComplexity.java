package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class isBST_withPoorTimeComplexity {
	
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
	public static int maximum(BinaryTree<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int leftMax = maximum(root.left);
		int rightMax = maximum(root.right);
		return Math.max(root.data, Math.max(leftMax,rightMax));
	}
	public static int minimum(BinaryTree<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		return Math.max(root.data,Math.max(leftMin, rightMin));
	}
	public static boolean isBST(BinaryTree<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftmax = maximum(root.left);
		if(leftmax>=root.data) {
			return false;
		}
		int rightmim = minimum(root.right);
		if(rightmim < root.data) {
			return false;
		}
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		return isLeftBST && isRightBST;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputLvlWise();
		System.out.println(isBST(root));
		
	}

}

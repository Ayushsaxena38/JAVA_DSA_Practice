package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class isBSTAnother {
	
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
	public static boolean isBstAnother(BinaryTree<Integer> root , int minRange , int maxRange) {
		if(root == null) {
			return true;
		}
		if(root.data <= minRange || root.data > maxRange ) {
			return false;
		}
		boolean left = isBstAnother(root.left , minRange , root.data-1);
		boolean right = isBstAnother(root.right,root.data , maxRange);
		return left&&right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputLvlWise();
		System.out.print(isBstAnother(root,Integer.MIN_VALUE,Integer.MAX_VALUE));

	}

}

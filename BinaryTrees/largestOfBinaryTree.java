package BinaryTrees;

import java.util.Scanner;

public class largestOfBinaryTree {
	
	public static BinaryTree<Integer> takeInputBetter(boolean isRoot, int parent, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the data of parent");
		}else {
			if(isLeft) {
				System.out.println("Enter the data of left child of parent" + parent);
			}else {
				System.out.println("Enter the data of right child of parent" + parent);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTree<Integer> root = new BinaryTree<>(rootData);
		BinaryTree<Integer> rootLeft = takeInputBetter(false, rootData, true);
		BinaryTree<Integer> rootRight = takeInputBetter(false,rootData,false);
		root.left = rootLeft;
		root.right = rootRight;
		return root;
	}
	
	public static void printDetailed(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":" );
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printDetailed(root.left);
		printDetailed(root.right);
	}
	
	public static int largest(BinaryTree<Integer> root) {
		if(root == null) {
			return -1;
		}
		int rootdata = root.data;
		int leftLargest = largest(root.left);
		int rightLargest = largest(root.right);
		return Math.max(rootdata,Math.max(leftLargest, rightLargest));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputBetter(true , 0 , true);
		printDetailed(root);
		System.out.println(largest(root));

	}

}

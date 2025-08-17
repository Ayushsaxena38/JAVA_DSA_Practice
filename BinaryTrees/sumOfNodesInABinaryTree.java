package BinaryTrees;

import java.util.Scanner;

public class sumOfNodesInABinaryTree {
	public static BinaryTree<Integer> takeInputBetter(boolean isRoot , int parent, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data ");
		}else {
			if(isLeft) {
				System.out.println("Enter data of left child of parent" + parent);
			}else {
				System.out.println("Enter data of right child of parent "+ parent);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTree<Integer> root = new BinaryTree(rootData);
		BinaryTree<Integer> rootLeft = takeInputBetter(false,root.data,true);
		BinaryTree<Integer> rootRight = takeInputBetter(false,root.data,false);
		root.left = rootLeft;
		root.right = rootRight;
		return root;
	}
	
	public static void printBinaryTreeDetailed(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left != null) {
			System.out.print("L"+  root.left.data +",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printBinaryTreeDetailed(root.left);
		printBinaryTreeDetailed(root.right);
		
	}
	
	public static int sumOfNodesDataInABinaryTree(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		int rootData = root.data;
		int rootLeftSum = sumOfNodesDataInABinaryTree(root.left);
		int rootRightSum = sumOfNodesDataInABinaryTree(root.right);
		return rootData + rootLeftSum + rootRightSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		printBinaryTreeDetailed(root);
		int sumOfBinaryTree = sumOfNodesDataInABinaryTree(root);
		System.out.println(sumOfBinaryTree);

	}

}

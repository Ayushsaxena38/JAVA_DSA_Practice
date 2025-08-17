package BinaryTrees;

import java.util.Scanner;

public class printNodeswithoutSiblings {
	
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
	
	public static void nodesWithoutSiblings(BinaryTree<Integer> root) {
		
		//Your code goes here
				if(root == null){
					return ;
				}
				if(root.left != null && root.right == null){
					System.out.print(root.left.data +" ");
				}
				if(root.left == null && root.right != null){
					System.out.print(root.right.data + " ");
				}
				nodesWithoutSiblings(root.left);
				nodesWithoutSiblings(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		printTreeDetailed(root);
		System.out.println();
		nodesWithoutSiblings(root);

	}

}

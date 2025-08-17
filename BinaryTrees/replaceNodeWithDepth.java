package BinaryTrees;

import java.util.Scanner;

public class replaceNodeWithDepth {
	
	
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
		
	public static void changeNodeDataWithHeight(BinaryTree<Integer> root , int k) {
		if(root == null) {
			return ;
		}else {
			root.data = k;
		}
		k++;
		if(root.left != null) {
			changeNodeDataWithHeight(root.left, k);
		}
		if(root.right != null) {
			changeNodeDataWithHeight(root.right, k);
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		printTreeDetailed(root);
		changeNodeDataWithHeight(root, 0);
		System.out.println();
		printTreeDetailed(root);

	}

}

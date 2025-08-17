package BinaryTrees;

import java.util.Scanner;

public class diameterOfBinaryTreeMyMethod {
	
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
	
	 public static int height(BinaryTree<Integer> root){
	       if(root == null){
				return 0;
			}
			int lh = height(root.left);
			int rh = height(root.right);
			return 1+Math.max(lh , rh);
	    }
	    static int ans = Integer.MIN_VALUE;
	    public static int diameterOfBinaryTree(BinaryTree<Integer> root) {
	      if(root == null){
				return 0;
			}
			int lh = height(root.left);
			int rh = height(root.right);
			ans = Math.max((lh + rh ) , ans);
			return ans;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputBetter(true, 0, true);
		printDetailed(root);
		System.out.println("Dia is " + diameterOfBinaryTree(root));

	}

}

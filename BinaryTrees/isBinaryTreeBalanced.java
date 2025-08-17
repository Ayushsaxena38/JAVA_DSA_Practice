package BinaryTrees;

import java.util.Scanner;


public class isBinaryTreeBalanced {
	
	public static BalancedTreeRes isBalancedBetter(BinaryTree<Integer> root) {
		if(root == null) {
			int h = 0;
			boolean isb = true;
			BalancedTreeRes a = new BalancedTreeRes();
			a.height = h;
			a.isBal = isb;
			return a;
		}
		BalancedTreeRes left = isBalancedBetter(root.left);
		BalancedTreeRes right = isBalancedBetter(root.right);
		int he = 1+Math.max(left.height , right.height);
		boolean isb = true;
		if(Math.abs(left.height - right.height) > 1) {
			isb = false;
		}
		if(!left.isBal || !right.isBal) {
			isb = false;
		}
		
		BalancedTreeRes ans = new BalancedTreeRes();
		ans.height = he;
		ans.isBal = isb;
		return ans;
	}

	
	public static int height(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return 1+Math.max(lh , rh);
	}
	
	public static boolean isBalanced(BinaryTree<Integer> root) {
		if(root == null) {
			return true;
		}
		int lnh = height(root.left);
		int rnh = height(root.right);
		if(Math.abs(rnh - lnh) > 1) {
			return false;
		}
		boolean isLftBalanced = isBalanced(root.left);
		boolean isrightBalanced = isBalanced(root.right);
		return isLftBalanced && isrightBalanced ;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputBetter(true, 0, false);
		printTreeDetailed(root);
		BalancedTreeRes ans = isBalancedBetter(root);
		System.out.println("is Balanced " + ans.isBal);	
	}

}

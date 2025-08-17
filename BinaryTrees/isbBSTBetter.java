package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class isbBSTBetter {
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
	
	public static isBSTReturn isBstBetter(BinaryTree<Integer> root) {
		if(root == null) {
			isBSTReturn ans = new isBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		isBSTReturn leftAns = isBstBetter(root.left);
		isBSTReturn rightAns = isBstBetter(root.right);
		int min = Math.min(root.data, Math.min(leftAns.min,rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		boolean isBST = true;
		if(leftAns.max >= root.data) {
			isBST = false;
		}
		if(rightAns.min<root.data ) {
			isBST = false;
		}
		if(!leftAns.isBST) {
			isBST = false;
		}
		if(!rightAns.isBST) {
			isBST = false;
		}
		isBSTReturn ans = new isBSTReturn(min, max, isBST);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = takeInputLvlWise();
		isBSTReturn ans = isBstBetter(root);
		System.out.println(ans.min + " "+ ans.max + " " + ans.isBST);
		
		

	}

}

package BinaryTrees;
import java.util.*;
public class BinaryTreeUseAndBasicOperations {
	public static void print(BinaryTree<Integer> root , int k , String s , int sum ){
		if(root.left == null && root.right == null) {
			sum += root.data;
			s += root.data;
			if(sum == k) {
				System.out.println(s);
				return;
			}
			return;
		}
		sum += root.data;
		s += root.data;
		String es = " ";
		s += es;
		if(root.left != null) {
			print(root.left,k,s,sum);
		}
		if(root.right != null) {
			print(root.right,k,s,sum);
		}
		
	}
	public static void rootToLeafPathsSumToK(BinaryTree<Integer> root, int k) {
		//Your code goes here
		String s = "";
		print(root , k , s , 0);
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
	
	public static BinaryTree<Integer> takeInputbasic(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root's data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTree<Integer> root = new BinaryTree<>(rootData);
		BinaryTree<Integer> rootLeft = takeInputbasic();
		BinaryTree<Integer> rootRight = takeInputbasic();
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
	
	public static void printTree(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTree<Integer> root = new BinaryTree<Integer>(1);
//		BinaryTree<Integer> rootRight = new BinaryTree<Integer>(3);
//		BinaryTree<Integer> rootLeft = new BinaryTree<Integer>(2);
//		root.right = rootRight;
//		root.left = rootLeft;
//		BinaryTree<Integer> root = takeInputbasic();
		BinaryTree<Integer> root = takeInputBetter(true,0,true);		
//		printTree(root);
		printTreeDetailed(root);
		rootToLeafPathsSumToK(root,13);
		

	}

}

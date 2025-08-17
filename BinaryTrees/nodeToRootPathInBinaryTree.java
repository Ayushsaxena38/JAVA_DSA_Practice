package BinaryTrees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class nodeToRootPathInBinaryTree {
	public static BinaryTree<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data of root node");
		int d = s.nextInt();
		BinaryTree<Integer> root = new BinaryTree<>(d);
		Queue<BinaryTree<Integer>> a = new LinkedList<>();
		a.add(root);
		while(!a.isEmpty()) {
			BinaryTree<Integer> n = a.poll();
			System.out.println("Enter the left Child of parent"+n.data);
			int nd = s.nextInt();
			if(nd != -1) {
				BinaryTree<Integer> nextNode = new BinaryTree<>(nd);
				n.left = nextNode;
				a.add(nextNode);
			}
			System.out.println("Enter the data of right child of parent" + n.data);
			int k = s.nextInt();
			if(k!=-1) {
				BinaryTree<Integer> ann = new BinaryTree<>(k);
				n.right = ann;
				a.add(ann);
			}
		}
		return root;

	}

	public static ArrayList<Integer> nodeToRootPath(BinaryTree<Integer> root , int x){
		if(root == null) {
			return null;
		}
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> left = nodeToRootPath(root.left, x);
		if(left != null) {
			left.add(root.data);
			return left;
		}
		ArrayList<Integer> right = nodeToRootPath(root.right, x);
		if(right != null) {
			right.add(root.data);
			return right;
		}
		return null;
	}
	public static void main(String[]args) {
		BinaryTree<Integer> path = takeInput();
		ArrayList<Integer> ntr = nodeToRootPath(path, 8);
		if(ntr == null) {
			System.out.println("Not Found");
		}else {
			for(int i : ntr) {
				System.out.println(i);
			}
		}
	}
}

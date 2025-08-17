package GenericTree;
import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class takeInputIterativelyByUsingQueue {
	public static void printTree(TreeNode<Integer> root) {
		//Special case and not base case
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for(int i = 0 ; i < root.children.size() ; i++) {
			TreeNode<Integer> node = root.children.get(i);
			printTree(node);

		}
	}

	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Root's Data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<>(rootData);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.remove();
			System.out.println("Enter the number of children of parent: " + front.data);
			int num = s.nextInt();
			for(int i = 0 ; i < num ; i++) {
				System.out.println("Enter the" + i + "th children data of parent: " + front.data);
				int childData = s.nextInt();
				if(childData == -1) {
					continue;
				}
				TreeNode<Integer> childNode = new TreeNode<>(childData);
				front.children.add(childNode);
				pendingNodes.add(childNode);
			}	
		}
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		printTree(root);

	}

}

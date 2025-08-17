package GenericTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class printTreeLvLWise {

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
	public static void printLVL(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<TreeNode<Integer>> a = new LinkedList<>();
		a.add(root);
		a.add(null);
		System.out.println(root.data);
		while(!a.isEmpty()) {
			TreeNode<Integer> front = a.poll();
			if(front == null) {
				if(a.isEmpty()) {
					return;
				}else {
					a.add(null);
					System.out.println();
				}
			}else {
				for(int i = 0 ; i<front.children.size(); i++) {
					TreeNode<Integer> child = front.children.get(i);
					a.add(child);
					System.out.print(child.data+" ");

				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		printLVL(root);
	}

}

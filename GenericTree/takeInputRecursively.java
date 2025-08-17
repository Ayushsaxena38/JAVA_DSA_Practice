
package GenericTree;

import java.util.Scanner;

public class takeInputRecursively {

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

	public static TreeNode<Integer> takeInput(boolean isRoot, int parent , int nth){
		if(isRoot) {
			System.out.println("Enter the Root's data");
		}else {
			System.out.println("Enter the "+nth+"th child's data of parent "+parent);
		}
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		if(r != -1) {
			TreeNode<Integer> node = new TreeNode<>(r);
			System.out.println("Enter the number of childs of parent "+r);
			int n = s.nextInt();
			for(int i = 0; i < n ; i++){
				TreeNode<Integer> child = takeInput(false,r,i);
				node.children.add(child);
			}
			return node;
		}else {
			return null;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput(true , 0,0);
		printTree(root);

	}

}

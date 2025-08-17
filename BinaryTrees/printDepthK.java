package BinaryTrees;

public class printDepthK {
	
	public static void printdepth(BinaryTree<Integer> root, int k) {
		if(root == null) {
			return ;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		printdepth(root.left, k-1);
		printdepth(root.right,k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

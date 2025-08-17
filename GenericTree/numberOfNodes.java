package GenericTree;

public class numberOfNodes {
	public static int numOfNodes(TreeNode<Integer> root) {
		// special case and not base case
		if(root == null) {
			return 0;
		}
		int count = 1;
		for(int i = 0 ; i < root.children.size(); i++) {
			int childCount = numOfNodes(root.children.get(i));
			count += childCount;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = new TreeNode<>(1);
		TreeNode<Integer> node1 = new TreeNode<>(2);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		TreeNode<Integer> node3 = new TreeNode<>(4);
		TreeNode<Integer> node4 = new TreeNode<>(5);
		TreeNode<Integer> node5 = new TreeNode<>(6);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(node4);
		node1.children.add(node5);
		System.out.println(numOfNodes(root));
	}

}

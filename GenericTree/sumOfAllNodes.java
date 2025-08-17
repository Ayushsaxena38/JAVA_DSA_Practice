package GenericTree;

public class sumOfAllNodes {
	public static int sum(TreeNode<Integer> root) {
		// for special case and not for base case
		if(root == null) {
			return 0;
		}
		int sum = root.data;
		for(int i = 0 ; i < root.children.size() ; i++) {
			int childsum = sum(root.children.get(i));
			sum += childsum;
		}
		return sum;
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
		System.out.println(sum(root));
	}

}

package BinaryTrees;

public class BuildBinaryTreeByPreOrderAndInOrder {
	public static BinaryTree<Integer> BT(int [] preOrder , int [] inOrder , int preStart, int preEnd, int inStart, int inEnd){
		if(inStart > inEnd) {
			return null;
		}
		int ri = 0;
		int rootValue = preOrder[preStart];
		BinaryTree<Integer> root = new BinaryTree<>(rootValue);
		for(int i = inStart; i <= inEnd; i++) {
			if(inOrder[i] == rootValue) {
				ri = i;
				break;
			}
		}
		int length = ri-inStart;
		BinaryTree<Integer> left = BT(preOrder,inOrder , preStart+1 ,preStart+length , inStart,ri-1);
		BinaryTree<Integer> right = BT(preOrder,inOrder,preStart+1+length , preEnd,ri+1,inEnd);
		root.left = left;
		root.right = right;
		return root;
	}
	
	public static BinaryTree<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		BinaryTree<Integer> root = BT(preOrder, inOrder, 0,preOrder.length-1,0,inOrder.length-1);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,4,8,9,10,11,5,3,6,7};
		int[] b = {8,4,10,9,11,2,5,1,6,3,7};
		BinaryTree<Integer> root = buildTree(a, b);

	}

}

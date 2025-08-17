package BinaryTrees;

public class BuildBinaryTreeByPostOrderAndInOrder {
	public static BinaryTree<Integer> BT(int [] postOrder , int [] inOrder , int postStart, int postEnd, int inStart, int inEnd){
		if(inStart > inEnd) {
			return null;
		}
		int ri = 0;
		int rootValue = postOrder[postStart];
		BinaryTree<Integer> root = new BinaryTree<>(rootValue);
		for(int i = inStart; i <= inEnd; i++) {
			if(inOrder[i] == rootValue) {
				ri = i;
				break;
			}
		}
		int length = ri-inStart -1;
		BinaryTree<Integer> left = BT(postOrder,inOrder , postStart+1 ,postStart+length , inStart,ri-1);
		BinaryTree<Integer> right = BT(postOrder,inOrder,postStart+1+length , postEnd,ri+1,inEnd);
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

	}

}

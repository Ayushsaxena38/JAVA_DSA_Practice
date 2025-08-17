package BinaryTrees;

public class bstClass {
	
		private BinaryTree<Integer> root;
		private int size;

		public static BinaryTree<Integer> insertHelper(BinaryTree<Integer> node,int x ){
			if(node == null){
				BinaryTree<Integer> nodeRoot = new BinaryTree<>(x);
				return nodeRoot;
			}
			if(x<node.data){
				node.left = insertHelper(node.left, x);
				
			}else if(x==node.data){
				node.left = insertHelper(node.left, x);
				
			}else{
				node.right = insertHelper(node.right, x);
			}
			return node;
		}
		public void insert(int data) {
			//Implement the insert() function
			size++;
			root =insertHelper(root,data);
		}
		public static int min(BinaryTree<Integer> root){
			if(root == null){
				return Integer.MAX_VALUE;
			}
			int minn = root.data;
			int leftmin = min(root.left);
			return Math.min(minn , leftmin);
		}
		public static BSTReturn removeHelper(BinaryTree<Integer> root, int x){
			if(root == null){
				BSTReturn output = new BSTReturn(null,false);
				return output;
			}
			if(root.data<x){
				BSTReturn newRight = removeHelper(root.right , x);
				root.right = newRight.n;
				newRight.n = root;
				return newRight;
			}
			if(root.data>x){
				BSTReturn newLeft = removeHelper(root.left,x);
				root.left = newLeft.n;
				newLeft.n = root;
				return newLeft;
			}
			if(root.left == null && root.right == null){
				BSTReturn newNode = new BSTReturn(null,true);
				return newNode;
			}
			if(root.left != null && root.right == null){
				BSTReturn newNode = new BSTReturn(root.left , true);
				return newNode;
			}
			if(root.left == null && root.right != null){
				BSTReturn newNode = new BSTReturn(root.right , true);
				return newNode;
			}
			int rightmin = min(root.right);
			root.data = rightmin;
			BSTReturn newRight = removeHelper(root.right , rightmin);
			root.right = newRight.n;
			newRight.n = root;
			return newRight;
			
		}
		public void remove(int data) {
			//Implement the remove() function
			if(size == 0) return ;
			BSTReturn nr = removeHelper(root,data);
			root = nr.n;
			if(nr.deleted){
				size--;
			}

		}
		public static void printTreeHelper(BinaryTree<Integer> node){
			if(node == null){
				return;
			}
			System.out.print(node.data + ":");
			if(node.left != null){
				System.out.print("L:"+node.left.data+",");
			}
			if(node.right!=null){
				System.out.print("R:" + node.right.data);
			}
			System.out.println();
			printTreeHelper(node.left);
			printTreeHelper(node.right);
			return;
		}
		public void printTree() {
			//Implement the printTree() function
			printTreeHelper(root);
		}
		public static boolean searchHelper(BinaryTree<Integer> node, int x){
			if(node == null){
				return false;
			}
			if(node.data == x){
				return true;
			}
			if(x<node.data){
				return searchHelper(node.left, x);
			}else{
				return searchHelper(node.right, x);
			}

		}
		public boolean search(int data) {
			//Implement the search() function
			if(size == 0) return false;
			return searchHelper(root,data);
		}

}

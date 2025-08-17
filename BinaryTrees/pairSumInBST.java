package BinaryTrees;

import java.util.Stack;

public class pairSumInBST {
	
	public static int length(BinaryTree<Integer> root ){
		if(root == null){
			return 0;
		}
		int l = length(root.left);
		int r = length(root.right);
		return 1+l+r;
	}
	public static void printNodesSumToS(BinaryTree<Integer> root, int s) {
		// Write your code here
		if(root == null){
			return;
		}
		Stack <BinaryTree<Integer>> st1 = new Stack<>();
		Stack <BinaryTree<Integer>> st2 = new Stack<>();
		BinaryTree<Integer> t1 = root;
		BinaryTree<Integer> t2 = root;
		while(t1!=null){
			st1.push(t1);
			t1=t1.left;
		}
		while(t2!=null){
			st2.push(t2);
			t2=t2.right;
		}
		int c = length(root);
		int n = 0;
		while(!st1.isEmpty() && !st2.isEmpty() && n<c/2){
			BinaryTree<Integer> s1 = st1.peek();
			BinaryTree<Integer> s2 = st2.peek();
			int sum = s1.data +s2.data;
			if(sum>s){
				BinaryTree<Integer> k = st2.pop();
				if(k.left!=null){
					k = k.left;
					while(k!=null){
						st2.push(k);
						k=k.right;
					}
				}
			}else if(sum < s){
				BinaryTree<Integer> k = st1.pop();
				if(k.right!=null){
					k = k.right;
					while(k!=null){
						st1.push(k);
						k=k.left;
					}
				}
			}else{
				n++;
				System.out.println(st1.peek().data+" "+st2.peek().data);
				BinaryTree<Integer> a = st1.pop();
				BinaryTree<Integer> b = st2.pop();
				if(a.right!=null){
					a=a.right;
					while(a!=null){
						if(a.right!=null){
							st1.push(a);
						}
						a=a.left;
					}
				}
				if(b.left!=null){
					b=b.left;
					while(b!=null){
						if(b.left!=null){
							st2.push(b);
						}
						b=b.right;
					}
				}
				
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

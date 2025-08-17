package Tries;

public class Trie {
	private TrieNode root;
	private int numWords;
	
	// Constructor
	public Trie() {
		this.root = new TrieNode('\0');
		this.numWords = 0;
		// in char null is defined as \0;
	}
	
	//helper function for add function;
	private void addHelper(TrieNode root , String word) {
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		//recursive call;
		addHelper(child , word.substring(1));
		
	}
	//add function
	public void add(String word) {
		addHelper(root,word);
		numWords++;
	}
	//searchHelper Function;
	private boolean searchHelper(TrieNode root , String word) {
		if(word.length() == 0) {
			if(!root.isTerminal) {
				return false;
			}
			return true;
		}
		int childIndex = word.charAt(0)-'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(child,word.substring(1));
	}
	// search function
	public boolean search(String word) {
		return searchHelper(root,word);
		
	}
	//remove function
	public void remove(String word) {
		removeHelper(root,word);
		numWords--;
		return;
	}
	
	// removeHelper function;
	private void removeHelper(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0)-'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
		//recursive call;
		removeHelper(child,word.substring(1));
		if(!child.isTerminal && child.childCount == 0) {
			root.children[childIndex] = null;
			root.childCount--;
		}
	}
	//total words count function
	public int countWords() {
		return numWords;
		  
	}
}

package Tries;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie a = new Trie();
		a.add("AYUSH");
		a.add("RISHAV");
		System.out.println(a.search("AYUSH"));
		a.remove("AYUSH");
		System.out.println(a.search("AYUSH"));
		System.out.println(a.countWords());
		a.add("NEWS");
		System.out.println(a.countWords());
	}

}

package Recrusion3InDSA;

public class subsequencesWithPrintTypeUsingRecursionTree {
	
	public static void printsubsequences2(String s, String asf) {
		if(s.length() == 0) {
			System.out.println(asf);
			return;
		}
		printsubsequences2(s.substring(1),asf);
		asf = asf+s.charAt(0);
		printsubsequences2(s.substring(1),asf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		printsubsequences2(s,"");

	}

}

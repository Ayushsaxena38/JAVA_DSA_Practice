package Recrusion3InDSA;

public class subsequencesWithPrintTypeUsingRecursionStack {
	
	public static void printSubsequences(String s ,String[] asf ) {
		if(s.length() == 0) {
			for(int i = 0 ; i < asf.length; i++) {
				System.out.println(asf[i]);
			}
			System.out.println(asf.length);
			return;
		}
		String[] nasf = new String[asf.length*2];
		for(int i = 0 ; i < asf.length ; i++) {
			nasf[i] = asf[i];
		}
		for(int i = 0 ; i < asf.length; i++) {
			nasf[i+asf.length] = asf[i]+s.charAt(0);
		}
		printSubsequences(s.substring(1), nasf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcd";
		
		printSubsequences(a, new String[] {""});

	}

}

package Recrusion3InDSA;

public class keypadCodeWithPrintTypeUsingRecrusionTree {
	
	static String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void printkeypadCode(int n , String asf) {
		if(n == 0) {
			System.out.println(asf);
			return;
			
		}
		int nn = n/10;
		String s = arr[n%10];
		for(int i = 0 ; i < s.length();i++) {
			printkeypadCode(nn, asf+s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 236;
		printkeypadCode(n, "");

	}

}

package Recrusion3InDSA;

public class keypadCode {
	static String [] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static String[] keypadCombination(int n ) {
		if(n == 0) {
			String[] output = new String[] {""};
			return output;
		}
		String[] output = keypadCombination(n/10);
		String s;
		s = arr[n%10];
		
		int ol = output.length;
		int sl = s.length();
		String[] myans = new String[ol*sl];
		int index =0;
		for(int i = 0 ; i <sl; i++) {
			Character ch;
			for(int j = 0 ; j<ol;j++) {
				ch = s.charAt(i);
				myans[index] = ch+output[j];
				index++;
			}
//			l++;
		}
		
		return myans;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 345;
		String[] ans = keypadCombination(n);
		for(int i = 0; i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		System.out.println(ans.length);
	}

}

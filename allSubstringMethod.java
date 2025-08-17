package fundamentals;

public class allSubstringMethod {
	public static void allSubstring(String str) {
		int n = str.length();
		for(int len = 1 ; len <= n ; len++) {
			for(int start = 0 ; start <= n-len; start++) {
				int end = start + len;
				System.out.println(str.substring(start , end));
			}
		}
	}

	public static void main(String[] args) {
		String str = "pqrs";
		allSubstring(str);
		
	}

}

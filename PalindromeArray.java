package fundamentals;

public class PalindromeArray{
	public static boolean checkpalindrome(String a) {
		int s = 0;
		int e = a.length()-1;
		while(e>s) {
			if(a.charAt(s) != a.charAt(e)) 
				return false;
			s++;
			e--;
		}
		return true;
	}

	public static void main(String[] args) 
	{ 
		String a ="abcda";
		System.out.print(checkpalindrome(a));
		}
}

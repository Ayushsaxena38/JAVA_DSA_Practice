package fundamentals;

public class removeConsecutiveDuplicateByRecrusion {
	
	public static String rCD(String s) {
		if(s.length() == 0) {
			return s;
		}
		String ans = "";
		for(int i = 0 ; i<s.length(); i++) {
			
		while(s.charAt(0) == s.charAt(i)) {
			i++;
		}
		String so = rCD(s.substring(i));
		ans += so;
		}
		return s.charAt(0)+ans;
	}

	public static void main(String[] args) {
		String s = "aayyuusshh";
		System.out.println(rCD(s));

	}

}

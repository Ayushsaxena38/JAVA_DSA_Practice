package fundamentals;

public class practice {
	public static String getCompressedString(String str) {
        char ch = str.charAt(0);
        String ans = new String("");
        int []fr = new int [256];
        for (int i = 0 ; i<str.length(); i++){
            fr[(int)(str.charAt(i))]++;
        }
        for(int i = 0 ; i < 255 ; i++){
            if(fr[i] != 0){
                ans += (char)(i);
                if(fr[i]>1){
                    ans += fr[i];
                }
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		String s = "aannssll";
		System.out.println(getCompressedString(s));

	}

}

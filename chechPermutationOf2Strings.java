package fundamentals;

public class chechPermutationOf2Strings {
	 public static boolean isPermutation(String str1, String str2){
	        if(str1.length() != str2.length())
	            return false;
	        int []fr = new int[256];
	        for(int i = 0 ; i<str1.length() && i<str2.length() ; i++){
	            fr[(int)(str1.charAt(i))]++;
	            fr[(int)(str2.charAt(i))]--;

	        }
	        for(int i = 0 ; i<255; i++){
	            if(fr[i] != 0){
	                return false;
	            }
	        }


	        return true;
	    }

	public static void main(String[] args) {
		String st1 = "silent";
		String st2 = "tnelis";
		System.out.println(isPermutation(st1,st2));

	}

}

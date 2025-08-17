
package fundamentals;

public class removeConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
        if(str.length() == 0){
            String str2 = new String("");
            return str2;
        }else{
            int []fr = new int[256];
            for(int i = 0 ; i<str.length(); i++){
                fr[(int)(str.charAt(i))]++;
            }
            String str1 = new String("");

            for(int i = 0 ; i < 255; i++){
                if(fr[i] != 0){
                    str1+=(char)(i);
                }
            }
            return str1;
        }

    }

	public static void main(String[] args) {
		String str = "";
		System.out.print(removeConsecutiveDuplicates(str));
		}

}

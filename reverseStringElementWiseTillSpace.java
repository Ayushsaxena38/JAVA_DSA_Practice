package fundamentals;

public class reverseStringElementWiseTillSpace {
	public static String reverseWordWise(String input) {
		int n = input.length();
        char c = ' ';
        StringBuffer strb = new StringBuffer("");
        int s = 0;
        for(int i = 0; i<n ; i++){
            if(input.charAt(i) == ' '){
                for(int j = i-1 ; j>=s ; j--){
                    strb.append(input.charAt(j));
                    
                }
                strb.append(" ");
                s = i+1;
            }
            if(i == n-1){
                int k = i;
                while(input.charAt(k)!=c){
                    strb.append(input.charAt(k));
                    k--;
                }
                break;
                }
            }
        
        String str = strb.toString();
        return str;

	}

	public static void main(String[] args) {
		String str = "My name is Ayush";
		System.out.println(reverseWordWise(str));
		str += 5;
		System.out.print(str);
		
	}

}

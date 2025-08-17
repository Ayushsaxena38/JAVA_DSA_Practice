package fundamentals;
import java.util.Scanner;
public class palindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String st = s.next();
        int l = st.length();
        int m = l-1;
        boolean isp = true;
        for(int i = 0 ; i < (l/2) ; i++) {
        	char ch = st.charAt(i);
        	char ch1 = st.charAt(m-i);
        	if(ch != ch1) {
        		isp = false;
        	}
        }
        if(isp == true) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
        
        
        

	}

}

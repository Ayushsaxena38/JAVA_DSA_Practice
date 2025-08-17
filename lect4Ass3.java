package fundamentals;
import java.util.*;
public class lect4Ass3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int even = 0;
        int odd = 0;
        
        for(int i = n ; i > 0 ; i = i/10){
        	int k = i%10;
            if(k%2==0){
                even = even + k;
            }else{
                odd = odd + k;
            }
        }
        
        System.out.print(even + " " + odd);

	}

}

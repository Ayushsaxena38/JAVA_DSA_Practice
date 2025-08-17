
package fundamentals;
import java.util.Scanner;
public class Triangle_of_Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p=1;
        int i = 1;
        while(i<=n){
            int sp = (n-i);
            while(sp>0){
            System.out.print(' ');
            sp--;
        	}	
        	p = i;
            int j = 1;
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }
            p = p - 2;
            int k = 2;
            while(k<=i){
            	System.out.print(p);
                k++;
                p--;
            }
             System.out.println();
            i++;
       
        }
	}

}

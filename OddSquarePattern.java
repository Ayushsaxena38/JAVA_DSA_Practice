package fundamentals;
import java.util.Scanner;

public class OddSquarePattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;

        while(i<=n) {
            int j=n;
            int odd= 2*i-1;
            while(j>=i){
                System.out.print(odd);
                odd=odd+2;
                j--;
            }
            int k =1;
            for(int p = 1; p <= (i-1); p+=1) {
            	System.out.print(k);
            	k +=2;
            }
            
            System.out.println();
            i++;
                    
        }
	}

}

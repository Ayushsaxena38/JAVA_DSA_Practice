package fundamentals;
import java.util.Scanner;
public class printPrimeNumberTillNth {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int  m = 0;
        if(n == 2){
            System.out.print(n);
        }else{
            System.out.println("2");
            
            for(int i = 3 ; i<=n ; i++){
                m=0;
                for(int j = 2 ; j<i ; j++){
                    if(i%j==0){
                        m = 1;
                    }
                    
                }
                if(m==0)
                        System.out.println(i);
            }
        }

	}

}

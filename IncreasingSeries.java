package fundamentals;
import java.util.Scanner;
public class IncreasingSeries {

	public static void main(String[] args) {
		 int n,r;
		 Scanner s = new Scanner(System.in);
		 System.out.println("please enter the value of n and r in NcR");
		 n = s.nextInt();
		 r = s.nextInt();
		    int factn=1,factr=1,factnr=1;
		    for(int i=2;i<=n;i++)
		    {
		        factn*=i;
		        if(i<=r)
		            factr*=i;
		        if(i<=n-r)
		            factnr*=i;
		    }
		    int ncr=factn/(factr*factnr);
		    System.out.print(ncr);
			
		
		
	}

}

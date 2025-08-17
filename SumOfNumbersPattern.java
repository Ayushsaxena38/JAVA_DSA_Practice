package fundamentals;
import java.util.Scanner;
public class SumOfNumbersPattern {

	public static void main(String[] args) {
		int i,counter, j;
	      Scanner s = new Scanner(System.in);
	      int n = s.nextInt();
	      for(j=2;j<=n;j++){
	         counter=0;
	         for(i=1;i<=j;i++){
	            if(j%i==0){
	               counter++;
	            }
	         }
	         if(counter==2)
	         System.out.println(j+" ");
	      }
	}

}

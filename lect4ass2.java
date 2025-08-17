package fundamentals;
import java.util.Scanner;
public class lect4ass2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			        int  n = s.nextInt();
			        int i, e , o , m;
			        e = 0;
			        o = 0;
			        i = n;
			        for(i=n;i>0;i=(i/10)){
			            m=i%10;
			            if(m%2==0){
			                e = e + m;
			            }
			            else if(m%2!=0){
			                o = o + m;
			            }
			        }
			        System.out.print(e);
			        System.out.print(o);

	}

}

package fundamentals;
import java.util.*;
public class Lect4ass1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int ba = s.nextInt();
        String str = s.next();
        char all = str.charAt(0);
        int al = 0;
        double hra,da,pf;
        hra = 0.2*ba;
        da = 0.5*ba;
        pf = 0.11*ba;
        if(all == 'A'){
            al = 1700;
        }
        else if(all == 'B'){
            al = 1500;
        }
        else{
            al = 1300;
        }
        double ts1 = ba + hra + da + al - pf;
        long ts =(Math.round(ts1));
        System.out.print(ts);

	}

}

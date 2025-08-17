package fundamentals;
import java.util.Scanner;


public class Lect4Code2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bs=s.nextInt();
		String str=s.next();
		char c=str.charAt(0);
		int all;
		if(c==65)
		{
			all=1700;
		}
		else if(c==66)
		{
			all=1500;
		}
		else
		{
			all=1300;
		}
		double ts=((bs+(0.20*bs)+(0.50*bs)+all)-(0.11*bs));
		double p=Math.round(ts);
		int h=(int)(p);
		System.out.println(h);
		// take basic salary and grade and than display the total salary
//		my programm
//		Scanner s = new Scanner(System.in);
//		int ba , allow =0;
//		double ts ,hra, da, pf;
//		ba = s.nextInt();
//		String str;
//		str = s.next();
//		char g;
//		g = str.charAt(0);
//		hra = 0.2*ba;
//		da = 0.5*ba;
//		pf = 0.11*ba;
//		if(g=='A')
//			allow = allow + 1700;
//		else if(g=='B')
//			allow = allow + 1500;
//		else if(g=='C')
//			allow = allow + 1300;
//		ts = ba + hra + da + allow - pf;
//		System.out.println(Math.round(ts));		

	}

}

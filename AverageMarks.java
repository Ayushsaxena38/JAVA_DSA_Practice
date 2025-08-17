package fundamentals;
import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		   Scanner s = new Scanner (System.in);
	        String name = s.next();
	        int m1, m2, m3, avg;
	        m1 = s.nextInt();
	        m2 = s.nextInt();
	        m3 = s.nextInt();
	        avg = (m1+m2+m3)/3;
	        char name1 = name.charAt(0);
	        System.out.println(name1);
	        System.out.println(avg);
//			byte i = 50;
//			i = i*50;
//	        System.out.print(i);
//			int a=50;
//	    	int b=Integer.MIN_VALUE;
//	    	if(a/0==b)
//	    	{
//	
//	    	    System.out.println("Hello");
//	    	}
//	    	else
//	    	{
//	     	   System.out.println("Hi");
//			}
	}
}
	



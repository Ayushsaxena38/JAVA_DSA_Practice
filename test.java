package fundamentals;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String [] sa = str.split("',");
		for(int i = 0 ; i < sa.length; i++) {
			System.out.println(i+":"+sa[i]);
		}
		int lastprice = Integer.parseInt(sa[sa.length-1]);
		
	}

}

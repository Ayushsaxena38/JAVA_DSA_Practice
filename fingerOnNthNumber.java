package fundamentals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fingerOnNthNumber {
	public static String count(int n ) {
		Queue<String> ans = new LinkedList<>();
		String a = "firstFinger";
		String b = "SecondFinger";
		String c = "ThirdFinger";
		String d = "FourthFinger";
		ans.add(a);
		ans.add(b);
		ans.add(c);
		ans.add(d);
		ans.add(c);
		ans.add(b);
		for(int i = 1; i< n; i++) {
			String curr = ans.poll();
			ans.add(curr);
		}
		return ans.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a = count(n);
		System.out.println(a);
	}

}

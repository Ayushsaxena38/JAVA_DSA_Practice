package stacks;
import java.util.*;
public class RedundotBrackets {
	
	public static boolean checkRedundantBrackets(String s){
		if(s.length() == 0 || s.length() == 1) {
			return true;
		}
		Stack<Character> st = new Stack<>();
		int c = 0;
		for(int i = 0 ;i < s.length(); i++) {
			if(s.charAt(i) != ')') {
				st.push(s.charAt(i));
			}
			if(s.charAt(i)==')') {
				while(st.peek() != '(') {
					st.pop();
					c++;
				}
				
				if(c == 0 || c==1) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((a+b))";
		System.out.println(checkRedundantBrackets(s));
		
	}

}

package stacks;

import java.util.Stack;

import BinaryTrees.isBSTReturn;

public class validParenthesis {
	
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch == '[' || ch == '{'  ){
                st.push(ch);
            }else{
            	if(st.size() == 0) {
            		return false;
            	}else if(ch == ')' && st.peek() == '('){
                    st.pop();
                }else if(ch == '}' && st.peek() == '{'){
                    st.pop();
                }else if(ch == ']' && st.peek() == '['){
                    st.pop();
                }else {
                	return false;
                }
            }
        }
        System.out.println(st.size());
        if(st.size()!= 0){
            return false;
        }else {
        	return true;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()";
		boolean ans = isValid(s);
		System.out.println(ans);

	}

}

package stacks;
import java.util.*;
class StockSpan {
	
	public static int[] stock_span(int [] price) {
		int [] span = new int[price.length];
		Stack<Integer> s = new Stack<>();
		span[0] = 1;
		s.push(0);
		for(int i = 0 ; i < price.length ; i++) {
			while(!s.isEmpty() && price[s.peek()] < price[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				span[i] = i+1;
			}else {
				span[i] = i-s.peek();
			}
			s.push(i);
		}
		return span;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = {40,35,50,43,22,55,53,63,53,21,66};
		int span[] = stock_span(price);
		for(int ele : span) {
			System.out.print(ele + " ");
		}
		

	}

}

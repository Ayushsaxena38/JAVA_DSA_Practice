package fundamentals;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 20;
		int c = 15*a/b;
		int d = 56/(a+b);
//		( )has max priority 
//		*,/,% has more priority
//		+,_ has less priority 
//		answer should be 3 because * first and then / will evaluate
		System.out.println(d);
		System.out.println(c);

	}

}

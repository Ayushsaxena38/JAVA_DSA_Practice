package fundamentals;

public class echo {

	public static void main(String[] args) {
		for(int i = 0 ; i < args.length ; i++) {
			System.out.print(args[i]+ " ");
			System.out.println();
		}
		System.exit(0);
	}
}

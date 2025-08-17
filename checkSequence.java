package fundamentals;
import java.util.Scanner;
public class checkSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int pr = s.nextInt();
		boolean isDec = true;
		for(int i = 1 ; i<n ; i++){
			int c = s.nextInt();
			if(c == pr){
				System.out.print("false");
				return;
			}else if(c>pr){
				isDec = false;
			}else{
				if(isDec == false){
					System.out.print("false");
					return;
				}
			}
			pr = c;
		}
		System.out.print("true");


	}

}

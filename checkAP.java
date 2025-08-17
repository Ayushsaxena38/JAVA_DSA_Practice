package fundamentals;
import java.util.Scanner;
public class checkAP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int pr = s.nextInt();
        int c = s.nextInt();
        int d = c-pr;
		boolean isa = true;
		for(int i = 1 ; i<(n-1) ; i++){
			int t = s.nextInt();
            if(t == (d+c)){
                isa = true;
            }else{
                isa = false;
                break;
            }
            c = t;
        }
        
        if(isa == true){
            System.out.print("true");
        }else{
            System.out.print("false");
        }

	}

}

package fundamentals;
import java.util.Scanner;

public class lect4code1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		String str=s.nextLine();

		char ch=str.charAt(0);

		if(ch>='A' && ch<='Z'){

			System.out.println(1);

		}

		else if(ch>='a' && ch<='z'){

			System.out.println(0);

		}

		else{

			System.out.println(-1);

		}       
	}

}



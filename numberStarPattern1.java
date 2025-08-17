package fundamentals;

import java.util.Scanner;

public class numberStarPattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int i, n;
		n = s.nextInt();
		i = 1;
		while(i<=n) {
			int j = n;
			while(j>=1) {
				
                if(j == i){
                    System.out.print("*");
                }else{
				System.out.print(j);
                }
                j -= 1;
			}
			System.out.println();
			i += 1;
		}

	}

}

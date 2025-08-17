package Test7;

import java.util.Scanner;

public class bobAndHisString {
	public static int maxd(String s1) {
		int n = s1.length();
		int res = -1;
		int[] arr = new int[123];
		for(int i = 0 ;i < 123 ; i++)
			arr[i] = -1;
		for(int i = 0; i<n;i++) {
			int check = arr[s1.charAt(i)];
			if(check == -1) {
				arr[s1.charAt(i)] = i;
			}else{
				res = Math.max(res , Math.abs(i- check-1));
			}
		}
		return res;
	}
	
	public static int maxdis(String s1){
		int ans = -1;
		for(int i= 0; i < s1.length()-1;i++){
				for(int j = i+1 ;j < s1.length();j++){
					if(s1.charAt(i) == s1.charAt(j)){
						
						ans = Math.max(ans,Math.abs(j-i-1));
					}
				}
		}
		return ans;
	}
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers of Strings you want to check");
		int n= s.nextInt();
		for(int i = 0 ; i<n ; i++){
			String str1 = s.next();
			System.out.println(maxdis(str1));

		}

	}

}

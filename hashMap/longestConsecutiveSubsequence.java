package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class longestConsecutiveSubsequence {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i = 0 ; i<arr.length; i++){
			map.put(arr[i] , true);
		}
		for( int i = 0; i<arr.length ; i++) {
			int c = arr[i]-1;
			if(map.containsKey(c)) {
				map.put(arr[i],false);
			}
		}
		int max = Integer.MIN_VALUE;
		int start = arr[0];
		for(int i = 0; i < arr.length ; i++) {
			if(map.get(arr[i])) {
				int lc = 0;
				int in = 1;
				while(map.containsKey(arr[i]+in)) {
					lc++;
					in++;
				}
				if(lc>max) {
					max = lc;
					start = arr[i];
				}else if(lc == max) {
					for(int j= 0 ;j < arr.length; j++) {
						if(arr[j]==start) {
							break;
						}else if(arr[j] == arr[i]) {
							start = arr[i];
						}
					}
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(start);
		ans.add(start+max);
		return ans;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 9,1,8,6,3,4,2,7,10,15};
		System.out.print(longestConsecutiveIncreasingSequence(arr));
		

	}

}

package hashMap;

import java.util.HashMap;

public class pairSumTo0 {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if(size == 0){
			return 0;
		}
		// Arrays.sort(input);
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(input[0],1);
		int pairSum = 0;
		for(int i = 1 ; i < size; i++){
			if(map.containsKey(-input[i])){
					pairSum += map.get(-input[i]);
				}
			if(map.containsKey(input[i])){
				map.put(input[i],map.get(input[i])+1);
			}else{
				map.put(input[i] , 1);
			}
		}
		return pairSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1,-1,3,-3, 4 , -4,2 ,1,-1};
		System.out.print(PairSum(a,a.length));
	}

}

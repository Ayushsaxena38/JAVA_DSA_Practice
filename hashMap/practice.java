package hashMap;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class practice {
	
	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}else{
				map.put(arr[i],1);
			}
		}
		 Collection<Integer> set= map.values();
		 for(int b : set) {
			 System.out.print(b+" ");
		 }
		int numPairs = 0;
		if(k == 0){
			for(int i = 0 ; i<arr.length; i++){
				if(map.containsKey(arr[i])){
					if(map.get(arr[i])>1){
						numPairs += map.get(arr[i]) -1;
						map.put(arr[i], map.get(arr[i])-1);
					}
				}
			}
			return numPairs;
		}
		for(int i = 0 ; i<arr.length; i++){
			int d = arr[i]-k;
			if(map.containsKey(d)){
				int a = (map.get(d));
				if(a>0){
					numPairs++;
					map.put(d,a-1);
				}
			}
		}
		return numPairs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1,2,3,9,0,8,6,4,3,1,2,3,4,5,4,5,4,3,1,2,3,45,1,2,3,4,5,6,7,8,9,0,9};
		System.out.print(getPairsWithDifferenceK(arr, 0));

	}

}

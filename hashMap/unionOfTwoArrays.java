package hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class unionOfTwoArrays {
	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		if(arr1.length == 0 || arr2.length == 0 ){
			return ;
		}
		HashMap<Integer,Integer> map = new HashMap<>();
//		int index = 0;
		for(int i = 0 ; i<arr1.length; i++){
			if(map.containsKey(arr1[i])){
				map.put(arr1[i] , map.get(arr1[i]) +1);
			}else{
				map.put(arr1[i] , 1);
				
			}
//			index++;
		}
		Arrays.sort(arr2);
		for(int i = 0 ; i < arr2.length ; i++){
			if(map.containsKey(arr2[i])){
				if(map.get(arr2[i]) > 0){
					System.out.print(arr2[i] + " ");
					map.put(arr2[i] , map.get(arr2[i])-1); 
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= { 9, 4,1,2,2,9,0,1,2,6};
		int[] arr2 = {9,7,5,6,8,1,0,0,6,5};
		intersection(arr1,arr2);

	}

}

package hashMap;


public class mapNodeUse {
	public static int maxFrequencyNumberbyMapNode(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(arr.length == 0){
			return -1;
		}
		
		Map<Integer,Integer> map = new Map<>();
//		Map<Integer,Boolean> a = new Map<>();
		for(int i = 0 ; i < arr.length; i++){
			if(map.containsKey(arr[i])){
				map.insert(arr[i], map.get(arr[i]) + 1);
			}else{
				map.insert(arr[i] , 1);
			}
		}
		int maxElement = arr[0];
        int maxCount = Integer.MIN_VALUE;
        
        for(int i = 0; i<arr.length; i++){  
           
            if( map.get(arr[i]) > maxCount){
                maxCount = map.get(arr[i]);
                maxElement =  arr[i];
            }
        }
        return maxElement;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,3,3,4,4,5,5,6,6,3,4,5};
		System.out.println(maxFrequencyNumberbyMapNode(arr));
		
	}

}

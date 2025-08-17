package fundamentals;

public class findUniqueElementInArrayButInTimeLimitOf1Second {
	
	public static int findUnique(int[] arr) {
		int n = arr.length-1;
        int xor = 0;
        for(int i = 0 ; i <= n ; i++){
            xor = xor^arr[i];
        }        
        return xor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

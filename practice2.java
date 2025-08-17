package fundamentals;

public class practice2 {
	public static void pritleaders(int []input) {
System.out.print(input[input.length-1] + " ");
        
		for(int i = input.length-1; i>=0; i--){
            int flag = 0;
            int j = i+1;
            while(j<input.length){
                if((j==input.length-1 && flag==0) && input[i]>=input[input.length-1]){
                    System.out.print(input[i] + " ");
                }
                if(input[i] < input[j]){
                    flag++;
                    break;
                }
                j++;
                
                
            }
        }
	}

	public static void main(String args[]) 
	{
		int [] arr = {3,12,34,2,0,-1};
		pritleaders(arr);
	}
}

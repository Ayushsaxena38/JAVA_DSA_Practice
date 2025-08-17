package fundamentals;

public class MergeSort {
	    public static int [] merge(int [] s1 , int [] s2 , int [] input){
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        while(i < s1.length || j < s2.length){
	            if(s1[i] <= s2[j]){
	                input[k] = s1[i];
	                i++;
	                k++;
	            }else{
	                input[k] = s2[j];
	                j++;
	                k++;
	            }
	        }
	        while(i < s1.length){
	            input[k] = s1[i];
	            i++;
	            k++;
	        }
	        while(j < s2.length){
	            input[k] = s2[j];
	            j++;
	            k++;
	        }
	        return input;
	    }

	    public static void mergeSort(int[] input){
	        if(input.length <= 1){
	            return;
	        }
	        int si = 0 , ei = input.length-1 ;
	        int mi = (si + ei)/2;
	        int [] s1 = new int[mi];
	        int [] s2 = new int[ei - mi + 1];
	        for(int i = 0 ; i < s1.length ; i++){
	            s1[i]  = input[i];
	        }
	        for(int i = 0 ; i < s2.length ; i++){
	            s2[i]  = input[mi];
	            mi++;
	    }
	        mergeSort(s1);
	        mergeSort(s2);
	        merge(s1,s2,input);
	    }
	    
	    public static void main (String args[]) {
	    	int [] a = {2,4,7,9,4,3,2,3};
	    	mergeSort(a);
	    	for(int i = 0 ; i < a.length ; i++) {
	    		System.out.print(a[i]+" ");
	    	}
	    }
	}
	    





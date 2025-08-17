package fundamentals;

public class binarySearchByResursion {
	
	public static int binarySearch(int a [] , int si , int ei , int x){
		if(si>ei) {
			return -1;
		}
		int mi = (si + ei)/2;
		if(a[mi] == x) {
			return mi;
		}else if(a[mi] > x) {
			return binarySearch(a, si, mi - 1, x); 
			}else {
				return binarySearch(a, mi + 1, ei, x);
			}
	}
	
	public static void main(String[]args) {
		int [] a = {2 , 4, 6, 9 ,10 , 13};
		int si = 0;
		int ei = a.length -1;
		System.out.println(binarySearch(a, si, ei, 10));
		
	}

}

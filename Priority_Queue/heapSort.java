package Priority_Queue;

public class heapSort {
	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		int n = arr.length;
		for(int si = 1 ; si < n ; si++){
			// up heapify
			int childIndex = si;
			int parentIndex =  (childIndex -1)/2;
			while(parentIndex >= 0) {
			if(arr[childIndex]<arr[parentIndex]) {
				int temp =arr[parentIndex];
				arr[parentIndex] = arr[childIndex];
				arr[childIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}else {
				break;
			}
		}
	}
	// now we have to delete;
	//first swap first and last element of pq
	for(int si = n-1 ; si > 0 ;si--){
		// first swap first and last element of pq
		int t = arr[si];
		arr[si] = arr[0];
		arr[0] = t;
		int parentIndex = 0;
		int minIndex = 0;
		int left = 1;
		int right = 2;

		while(parentIndex<si) {
			//find the minimum priority index;
			if(left < si && arr[left] < arr[minIndex]) {
				minIndex = left;
			}
			if(right < si && arr[right]<arr[minIndex]) {
				minIndex = right;
			}
			
			if(minIndex == parentIndex) {
				break;
			}
			// swap the minIndex and maxIndex;
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;
			parentIndex = minIndex;
			left = (minIndex*2)+1;
			right = left+1;
		}
//		break;
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,8,5,4,3}; 
		inplaceHeapSort(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

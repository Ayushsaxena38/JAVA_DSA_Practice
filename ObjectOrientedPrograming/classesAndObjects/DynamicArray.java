package classesAndObjects;

public class DynamicArray {
	private int [] data;
	private int nextElementIndex;

	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}

	public void add (int n) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex] = n;
		nextElementIndex++;

	}

	private void doubleCapacity() {
		int temp [] = data;
		data = new int [temp.length*2];
		for(int i = 0 ; i < temp.length ; i++) {
			data[i] = temp[i];
		}
	}

	public int get(int i) {
		if(i >= nextElementIndex) {
			//Throw error
			return -1;
		}else {

			return data[i];
		}
	}

	public void set(int i , int n) {
		if(i >= nextElementIndex) {
			//Throw error
			return;
		}else {
			data[i] = n;
		}
	}

	public int size() {
		return nextElementIndex;
	}

	public int removeLast() {
		if(nextElementIndex == 0) {
			//Throw error
			return -1;
		}else {
			int temp = data[nextElementIndex-1];
			nextElementIndex--;
			return temp;
		}
	}

	public boolean isEmpty() {
		if(nextElementIndex == 0) {
			return true;
		}else {
			return false;
		}
	}

}
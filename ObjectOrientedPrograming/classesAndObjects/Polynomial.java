package classesAndObjects;


public class Polynomial {
	private int [] data;
	private int nextElementIndex;

	public Polynomial() {
		data = new int[5];
		nextElementIndex = 0;
	}

	public void setCofficient (int i, int n) {
		while(i>=this.data.length) {
			doubleCapacity();
		}
		this.data[i] = n;
		nextElementIndex++;
	}

	private void doubleCapacity() {
		int temp [] = data;
		data = new int [temp.length*2];
		for(int i = 0 ; i < temp.length ; i++) {
			data[i] = temp[i];
		}
	}

	public void print(){
		for(int i=0;i<this.data.length;i++)
		{
			if(this.data[i]!=0)
				System.out.print(this.data[i] +  "x" + (i)+ " ");
		}
	}

	public Polynomial add(Polynomial p) {
		int m = Math.min(this.data.length, p.data.length);
		for(int i = 0 ; i<m;i++) {
			this.data[i] = this.data[i]+p.data[i];
		}
		return this;

	}

	public Polynomial suntract(Polynomial p) {
		int m = Math.min(this.data.length, p.data.length);
		for(int i = 0 ; i<m;i++) {
			this.data[i] = this.data[i]-p.data[i];
		}
		return this;

	}


	public Polynomial multiply(Polynomial p) {
		int l1 = 0,l2 = 0;
		for(int i = this.data.length - 1 ; i>=0;i++) {
			if(this.data[i] != 0) {
				l1 = i;
				break;
			}
		}
		for(int i = p.data.length - 1 ; i>=0;i++) {
			if(p.data[i] != 0) {
				l2 = i;
				break;
			}
		}

		int ans [] = new int [l1+l2];
		for(int i = 0 ; i<this.data.length ; i++) {
			for(int j = 0 ; j < p.data.length ; j++) {
				ans[i+j] += this.data[i]*p.data[j];
			}
		}

		this.data = new int [ans.length];
		for(int i = 0 ; i < ans.length ; i++) {
			this.data[i] = ans[i];
		}
		return this;
	}
}

package generics;

public class Print {

	public static<T extends Vehicle> void printArray(T arr[]) {
		for(int i = 0 ; i<arr.length; i++) {
			arr[i].print();
			//			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		//		// TODO Auto-generated method stub
		//		String [] arrS = new String[5];
		//	    char a = 'a';
		//		for(int i = 0 ; i<arrS.length ; i++) {
		//		arrS[i] += (char)(a+i);

		//		printArray(arrS);


		Vehicle v[] = new Vehicle[5];
		for(int i = 0; i < v.length ; i++) {
			v[i] = new Vehicle(i+200,"TATA");
		}



		//		Vehicle v[] = new Vehicle[5];
		//		for(int i = 0 ; i<v.length ; i++) {
		//			v[i] = new Vehicle();
		//		}
			printArray(v);




	}
}

package classesAndObjects;

public class fractionUse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new Fraction(3,2);
		//add both the fraction and save the result in f1
//		f1.add(f2);
//		f1.print();
		Fraction f3 = Fraction.add(f1, f2);
		f3.print();
		
		
		
		
		

	}

}

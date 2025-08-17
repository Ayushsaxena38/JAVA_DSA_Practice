package classesAndObjects;

public class Fraction {

	private int numerator;
	private int denominator;





	void simplify(){

		int min = Math.min(numerator, denominator);
		int gcd = 0;
		for(int i = 1 ; i <= min ; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}



		numerator = numerator / gcd;
		denominator = denominator / gcd;

	}

	public Fraction(int n , int m) {
		this.numerator = n;

		if(m>0) {
			this.denominator = m;
		}else {
			this.denominator = 1;
		}

		simplify();

	}

	public void increment() {

		numerator = numerator + denominator;
		simplify();

	}

	public void print() {

		System.out.println(this.numerator + "/" + this.denominator);

	}

	public void setNumerator(int n) {
		this.numerator = n;
	}

	public void setDenominaator(int n) {
		if(n>0) {
			this.denominator = n;
		}else {
			// throw error
			return;
		}
	}

	public int getNumerator() {
		int i = numerator;
		return i;
	}

	public int getDenominator() {
		int m = denominator;
		return m;

	}
	
	public void add(Fraction f2) {

		int n1 = this.getNumerator();
		int n2 = f2.getNumerator();
		int d1 = this.getDenominator();
		int d2 = f2.getDenominator();
		int d = d1*d2;
		int n = ((n1*d)+(n2*d));
		this.setNumerator(n);
		this.setDenominaator(d);
		
		simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int n1 = f1.getNumerator();
		int n2 = f2.getNumerator();
		int d1 = f2.getDenominator();
		int d2 = f2.getDenominator();
		int d = d1*d2;
		int n = ((n1*d)+(n2*d));
		Fraction f = new Fraction(n,d);
		return f;
	}
	

}

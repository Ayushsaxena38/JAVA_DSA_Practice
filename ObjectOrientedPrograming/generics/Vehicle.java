package generics;

public class Vehicle {
	int maxSpeed;
	String company;
	
	public Vehicle(int m, String com) {
		this.maxSpeed = m;
		this.company = com;
	}
	
	public void print() {
		System.out.println(company + " " + maxSpeed);
	}
	

}

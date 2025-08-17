package classesAndObjects;

public class Student {
	
	String name;
	private int rollNumber;
	public void setRollNumber(int rollNumber) {
		if(rollNumber < 0) {
			return;
		}else {
			this.rollNumber = rollNumber;
		}
	}
	
	public int getRollNumber() {
		return this.rollNumber;
	}
	
}
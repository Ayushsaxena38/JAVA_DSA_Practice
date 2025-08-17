package classesAndObjects;

public class StudentUse {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(Source);
		Student s1 = new Student();
		s1.name = "Ayush";
		s1.setRollNumber(16);
		System.out.print(s1.name + " ");
		System.out.println(s1.getRollNumber());
		
	}

}


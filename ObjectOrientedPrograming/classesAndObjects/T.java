package classesAndObjects;

class T extends Vehicle {
    public static void main (String[] args) {
//    	practice t=new practice();              
//        t.set_marks(78);                //Line 2
//        System.out.print(practice.marks);   //Line 3
	 Bicycle b = new Bicycle();
//	 b.set("red");
//	 b.color = "red";
	 b.print();
    }

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}
}

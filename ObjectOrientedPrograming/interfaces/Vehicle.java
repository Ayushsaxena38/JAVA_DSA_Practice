package interfaces;

public class Vehicle implements VehicalInterface , CarInterface  {

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
	
	void prnt(){
	      System.out.println(PI);
	    }

	@Override
	public int numGear() {
		// TODO Auto-generated method stub
		return 0;
	}

}

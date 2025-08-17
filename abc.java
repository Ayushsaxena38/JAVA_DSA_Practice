package fundamentals;

public class abc {//interview problem
	static void A() throws Exception{
		int count = 0;
		try{
			count++;
			try{
				count++;
				try{
					count++;
					throw new Exception();
				}
				catch(Exception ex){
					count++;
					throw new Exception();
				}
			}
			catch(Exception ex){
					count++;
					throw new Exception();
			}
		}
		catch(Exception ex){
			count++;
		}
		System.out.print(count);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		A();
	}

}

package fundamentals;
import java.util.Arrays;
public class CheckArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 30, 25, 40, 50 };
	     int b[] = { 30, 25, 40, 50 };
	     boolean result = Arrays.equals(a, b);
	     if (result == true) {
	          System.out.println("Two arrays are equal");
	     }else {
	          System.out.println("Two arrays are not equal");
	     }

	}
}

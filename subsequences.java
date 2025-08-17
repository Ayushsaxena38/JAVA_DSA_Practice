package fundamentals;
import java.util.*;

public class subsequences {

	public static ArrayList<String> subse(String str){
		if(str.length() == 0){
			ArrayList<String> rans = new ArrayList<>();
			rans.add(str);
			return rans;
		}
		
		ArrayList<String> rans = subse(str.substring(1));
		int n = rans.size();
		ArrayList<String> myans = new ArrayList<>();
		for(int i = 0 ; i<rans.size(); i++) {
			myans.add(i, rans.get(i));
		}
		for(int i = 0 ; i < rans.size(); i++) {
			myans.add(i+n, str.charAt(0)+rans.get(i));
		}
		return myans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcd";
		ArrayList<String> ans = subse(a);
		for(int i = 0 ; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}

	}

}

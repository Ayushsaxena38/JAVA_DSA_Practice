package fundamentals;
import java.util.HashMap;
import java.util.Scanner;
public class frequencyOfCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0 ; i < str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}else{
				map.put(str.charAt(i) , 1);
			}
		}
		System.out.print(map);
		
	}

}

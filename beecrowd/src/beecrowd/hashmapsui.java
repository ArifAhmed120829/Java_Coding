package beecrowd;

import java.util.HashMap;
import java.util.Scanner;

public class hashmapsui {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Arif", 23);
		String name = in.next();
		if(map.containsKey(name)) {
			System.out.println("He is "+map.get(name)+" Years old");
		}
		else {
			System.out.println("Name is not found");
		}
		

	}

}

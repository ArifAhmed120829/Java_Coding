package beecrowd;

import java.util.Arrays;

public class Specific_Elements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Arif","Ezaz","Niloy","Munna","Jarif","Hasib"};
		System.out.println("Original Array: "+Arrays.toString(name));
		String name1 = "Jarif";
		String name2 = "Hasib";
		System.out.println("Result: "+result(name,name1,name2));

	}
	public static boolean result(String[] name, String name1, String name2) {
		for(String names : name) {
			boolean r = names != name1 && names != name2;
			if(r) {
				return false;
			}
		}
		return true;
	}

}

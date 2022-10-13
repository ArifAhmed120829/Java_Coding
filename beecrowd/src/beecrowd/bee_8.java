package beecrowd;

import java.util.Scanner;

public class bee_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String s = in.next();
			String result = "";
			char[] a = new char[s.length()];
			int number = in.nextInt();
			for(int j = 0; j<number; j++) {
				int x = in.nextInt();
				result  = result + s.charAt(x-1);
			}
		
			System.out.println(result);
		}

	}

}

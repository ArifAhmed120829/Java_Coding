package beecrowd;

import java.util.Scanner;

public class bee_1 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		for(;;) {
			int test_case = in.nextInt();
			in.nextLine();
			String[] l = new String[50];
			String res ="";
			for(int i = 0; i<test_case; i++) {
				 l[i] = in.nextLine();
			}
			for(int i = 0; i<test_case; i++) {
				String[] words = l[i].trim().split("\\s+");
				for(String w:words) {
					System.out.print(w+" ");
					res = res + w + " ";
				}
				System.out.println(res.length());
				System.out.println(res.length()-1);
			}
		}
		

	}

}

package beecrowd;

import java.util.Scanner;

public class missing_value2 {

	public static void main(String[] args) {
		// Scan 7 numbers and from them find the missed one
		Scanner in = new Scanner(System.in);
		int[] z ;
		z = new int[10];
		for(int i = 0; i<7; i++) {
			z[i] = in.nextInt();
		}
		for(int z1 = 0; z1<7; z1++) {
			System.out.println(z[z1]);
		}

	}

}

package beecrowd;

import java.util.Scanner;

public class missing_value2 {

	public static void main(String[] args) {
		// Scan 7 numbers and from them find the missed one
		Scanner in = new Scanner(System.in);
		int[] z ;
		int sum = 0;
		z = new int[10];
		for(int i = 0; i<7; i++) {
			z[i] = in.nextInt();
		}
		int z2 = z.length;
		int math = z2*((z2+1)/2);
		for(int z1 = 0; z1<7; z1++) {
			
			sum = sum + z[z1];
		}
		System.out.println(math - sum);

	}

}

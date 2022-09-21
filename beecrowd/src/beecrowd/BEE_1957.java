package beecrowd;

import java.util.Scanner;

public class BEE_1957 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int V = in.nextInt();
		int res1 = V/16;
		int rem1 = V%16;
		while(res1!=0) {
			res1 = res1/16;
		}

	}

}

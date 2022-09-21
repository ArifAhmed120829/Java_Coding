package beecrowd;

import java.util.Scanner;

public class BEE_2057 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int S = in.nextInt();
		int T = in.nextInt();
		int F = in.nextInt();
		
		int res = S+T+F;
		if(res>=24) {
			res = res - 24;
		}
		if(res<0) {
			res = 24 +res;
		}
		System.out.println(res);

	}

}

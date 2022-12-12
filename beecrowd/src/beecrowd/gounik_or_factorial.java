package beecrowd;

import java.util.Scanner;

public class gounik_or_factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int num = in.nextInt();
			System.out.println(recursion(num));
		}

	}

	private static int recursion(int num) {
		int res;
		if(num==0) {
			return 1;
		}
		
		else {
			res = recursion(num - 1) * num;
			System.out.println(res);
			return res;
		}
		
	}

}

package beecrowd;

import java.util.Scanner;

import java.lang.Math;

public class Nine {

	public static void main(String[] args) {
		//Test case = 3
		Scanner in  =  new Scanner (System.in);
		int t = in.nextInt();
		for(int i  = 0 ; i<t; i++) {
			int N = in.nextInt();//16
			double r =  Math.sqrt(N);
			if(Math.ceil(r) == Math.floor(r))
			{
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}

	}

}

package beecrowd;

import java.util.Scanner;

public class SumEven_1159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		//read an integer X indefinite times (stop when X=0).
		for(;;) {
			int X = in.nextInt();//4
			if(X==0) {
				break;
			}
			//For each X, print the sum of five consecutive even numbers from X, including it if X is even
			else if(X%2==0) {//4
				sum = 0;
				for(int i = 1; i <=5;i++) {
					sum = sum + X;//4+6
					X = X+2;
				}
			}
			else {//11
				X = X+1;
				sum = 0;
				for(int i = 1; i<=5;i++) {
					sum = sum + X;//12+14
					X = X+2;
				}
			}
			System.out.println(sum);
			
		}

	}

}

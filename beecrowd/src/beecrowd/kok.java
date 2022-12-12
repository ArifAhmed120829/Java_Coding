package beecrowd;

import java.util.Scanner;

public class kok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner in = new Scanner(System.in);
	while(in.hasNext()) {
		double sum = 0;
		int t = in.nextInt();
		for(int i = 0; i<t; i++) {
			int x = in.nextInt();
			sum = sum + x;
			
		}
		double num = (double) 2 /  (double) 3;
		double res = (num) * t;
		System.out.println(res);
		if(res>sum) {
			System.out.println("acusacao arquivada");
		}
		else {
			System.out.println("impeachment");
		}
	}

	}

}

package beecrowd;

import java.util.Scanner;

public class Easy_Fibonacci_1151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int first = 0;
		int second = 1;
		int res;
		
		int x = in.nextInt();
		System.out.print(first+" "+second);// 0 1
		for(int i = 2; i<x; i++) {
			res = first + second;
			System.out.print(" "+res);//1,2,3
			first = second;
			second = res;
		}
		System.out.println();
		
		

			
			
		}
	}



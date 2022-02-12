package beecrowd;

import java.util.Scanner;

public class Logical_Sequence2_1145 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int Y = in.nextInt();
		int Z = Y/X;
		int m = 1;
		int  l = 1;
		for(int i = 1; i<=Z;i++) {
			System.out.print(m);
			for(int j = 1; j<X; j++) {
				l = l+1;
				System.out.print(" "+l);
			}
			m = m + X;
			l++;
			System.out.println();
		}

	}

}




































/*
Write an program that reads two numbers X and Y // 3 99
show a sequence of 1 to y,  // 1 - 99
passing to the next line to each X numbers // 
The input contains two integer numbers X (1 < X < 20) and Y (X < Y < 100000).






*/
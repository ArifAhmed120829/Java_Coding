package beecrowd;

import java.util.Scanner;

public class Caesar_Cipher {
	static Scanner in =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Letters: A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
		//if number of right shift is 25 then Z = A;
		//A->C,B->D,Y->A etc;
		//A = 65, Z = 90;
		//int test_case = in.nextInt();
		/*
		for(int i = 0; i<test_case; i++) {
			String c_s = in.next();//c_s = codified sentence
		}
		*/
		String a = "Z";
		char g = a.charAt(0);
		int g1 = Integer.valueOf(g);
		int x1 = g1-2;
		char d = Character.valueOf((char) x1);
		System.out.println(x1);
		System.out.println(d);

	}

}

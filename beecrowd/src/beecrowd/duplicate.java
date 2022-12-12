package beecrowd;

import java.util.Scanner;

//Write a Java program to print after removing duplicates from a given string.

public class duplicate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] c = new char[s.length()];
		for(int i = 0; i<s.length(); i++) {
			c[i] = s.charAt(i);
		}
		int count = 1;
		String res = "";
		int[] index = new int[s.length()];
		int d = 0;
		for(int i = 0; i<s.length(); i++) {
			for( int j = count; j<s.length(); j++) {
				if(c[i] == c[j]) {
					index[d]  = j;
					d++;
				}
			}
			count++;
		}
		int g = 0;
		for(int i = 0; i<s.length(); i++) {
			if(i==index[g]) {
				g++;
				continue;
			}
			res = res + c[i];
		}
		
		
		System.out.println(res);

	}

}

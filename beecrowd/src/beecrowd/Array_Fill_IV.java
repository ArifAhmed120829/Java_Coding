package beecrowd;

import java.util.Scanner;

public class Array_Fill_IV {

	public static void main(String[] args) {
		Scanner in  =  new Scanner (System.in);
		int [] par;
		par = new int[5];
		int [] impar;
		impar = new int[5];
		int [] par2;
		par2 = new int[5];
		int [] impar2;
		impar2 = new int[5];
		int number;
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		for(int x = 0; x<10;x++) {
			number = in.nextInt();
			if(number%2==0) {
				par[i] = number;
				i++;
				if(i==5) i = 0;
			}
			else if(i==5 && j==5) break;
			else {
				impar[j] = number;
				j++;
				if(j==5) j =0;
			}
		
		}
		for(int x = 0; x<5;x++) {
			number = in.nextInt();
			if(number%2==0) {
				par2[k] = number;
				k++;
			}
			
			else {
				impar2[l] = number;
				l++;
			}
		}
		
		for(int x = 0 ; x<5;x++) System.out.println("par["+x+"] = "+par[x]);
		for(int x = 0; x<5;x++) System.out.println("impar["+x+"] = "+impar[x]);
		for(int x = 0; x<l;x++) System.out.println("impar["+x+"] = "+impar2[x]);
		for(int x = 0 ; x<k;x++) System.out.println("par["+x+"] = "+par2[x]);
	
		
	}

}




























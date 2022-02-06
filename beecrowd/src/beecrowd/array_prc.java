package beecrowd;

import java.util.Scanner;

public class array_prc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read 15 numbers
		Scanner in = new Scanner(System.in);
		int[] par;// if the number is even
		int[] impar;//if the number is odd
		par = new int[5];
		impar = new int[5];
		int x = 15;
		int j = 0;
		int k = 0;
		int i;
		for( i = 0; i<x; i++) {
			int num = in.nextInt();
			
			if(num%2==0) {
				//System.out.println("par["+j+"] = "+num);
				par[j] = num;
				j++;
				if(j==5) j=0;
			}
			else {
				//System.out.println("impar["+k+"] = "+num);
				impar[k] = num;
				k++;
				if(k==5) k=0;
			}
			
		}
		for(i =0; i<x; i++) {
			if(par[j]%2==0) 
				System.out.println("par["+j+"] = "+par[j]);
				j++;
				if(j==5) j=0;
				
			
				else
				System.out.println("impar["+k+"] = "+impar[k]);
				k++;
				if(k==5) k=0;
			}
	}
	
			
		
		

	}



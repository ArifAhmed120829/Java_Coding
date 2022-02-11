package beecrowd;

import java.util.Scanner;

public class Experiments_1094 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int sum;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i = 0; i<N; i++) {
			int amount = in.nextInt();
			String str = in.next();
			char ch = str.charAt(0);
			if(ch== 'C') {
				sum1 = sum1 + amount;
			}
			else if(ch== 'R') {
				sum2 = sum2 + amount;
			}
			else if(ch== 'S') {
				sum3 = sum3 + amount;
			}
			
		}
		sum = sum1+sum2+sum3;
		System.out.println("Total: "+sum+" cobaias");
		System.out.println("Total de coelhos: "+sum1);
		System.out.println("Total de ratos: "+sum2);
		System.out.println("Total de sapos: "+sum3);
		double rabit = (double) sum/ (double) sum1;
		double rabit2 = 100/rabit;
		String str1 = String.format("%.2f",rabit2 );
		System.out.println("Percentual de coelhos: "+str1+" %");
		double rat = (double) sum/ (double) sum2;
		double rat2 = 100/rat;
		String str2 = String.format("%.2f",rat2 );
		System.out.println("Percentual de ratos: "+str2+" %");
		double frog = (double) sum/ (double) sum3;
		double frog2 = 100/frog;
		String str3 = String.format("%.2f",frog2 );
		System.out.println("Percentual de sapos: "+str3+" %");

	}

}


















































/*

three types of animals: frogs, rats and rabbits.
character Type ('C', 'R' or 'S'), indicating the type of animal:
Print the total of animals used,
the total of each type of animal and
the percentual of each one in relation of the total of animals used.
The percentual must be printed with 2 digits after the decimal point.
25.00 %
92/23 = 4 
100/4 = 25%
31.52 %
92/29 = 3.17
100/3.172 = 31.52%
*/
	



























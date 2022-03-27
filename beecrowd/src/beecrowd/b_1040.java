package beecrowd;

import java.util.Scanner;

public class b_1040 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		float a,b,c,d;
		a = in.nextFloat();
		b = in.nextFloat();
		c = in.nextFloat();
		d = in.nextFloat();
		a = a*2;
		b = b*3;
		c = c*4;
		d = d*1;
		float avg = (a+b+c+d)/10;
		System.out.printf("Media: %.1f",avg);
		System.out.println();
		if(5.0<=avg && avg<6.9) {
			System.out.println("Aluno em exame.");
			System.out.println("Nota do exame: ");
			float e = in.nextFloat();
			float avg2 = (e + avg) / 2;
			if(avg2>=5) System.out.println("Aluno aprovado.");
			else if(avg2<=4.9) System.out.println("Aluno reprovado.");
			System.out.printf("Media final: %.1f",avg2);
		}
		else if(avg>=7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if(avg<5.0) System.out.println("Aluno reprovado.");

	}

}

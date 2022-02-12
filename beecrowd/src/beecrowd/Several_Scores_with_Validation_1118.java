package beecrowd;

import java.util.Scanner;

public class Several_Scores_with_Validation_1118 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sum1=0;
		
		int X;
		double values;
		double avg1;
		
		int valid_score = 1;
		
		for(;;) {
			values = in.nextDouble();
			if(values>=0 && values<=10) {
				sum1 = sum1 + values;
				valid_score++;
				if(valid_score>2) {
					avg1 = sum1/2;
					String str1 = String.format("%.2f", avg1);
					System.out.println("media = "+str1);
					break;
				}
			}
			else {
				System.out.println("nota invalida");
			}
			
		}
		for(;;) {
			X = in.nextInt();
			if(X==2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				break;
			}
			else if(X<1 || X>2) System.out.println("novo calculo (1-sim 2-nao)");
			else {
				double sum2=0;
				double avg2;
				int valid_score2 = 1;
				System.out.println("novo calculo (1-sim 2-nao)");
				for(;;) {
					values = in.nextDouble();
					if(values>=0 && values<=10) {
						sum2 = sum2 + values;
						valid_score2++;
						if(valid_score2>2) {
							avg2 = sum2/2;
							String str2 = String.format("%.2f", avg2);
							System.out.println("media = "+str2);
							break;
						}
					}
					else {
						System.out.println("nota invalida");
					}
					
				}
				
				
			}
		}

	}

}


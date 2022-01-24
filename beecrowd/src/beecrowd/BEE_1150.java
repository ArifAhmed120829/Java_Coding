package beecrowd;

import java.util.Scanner;

public class BEE_1150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//READ TWO INTEGERS
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();//21//3
		int Z = in.nextInt();//21//1
		int i = 0;
		int j = 0;
		//Z MUST BE READ UNTIL BIGGER X APPEARS
		while(Z<=X) {//1<=3
			Z = in.nextInt();//21=21//20
		}
		while(j<Z) {//30,43>30 so stop//0<20
			j+=X;//j = j + X; j = 0+21, j = 21 + 22 = 43// j = 0+3, j = 3+4 =7+5=12+6=18+7=25
			i++;//1+1 = 2; Ans...//1+1+1+1+1
			X++;//22+1 = 23;//4+1+1+1+1
		}
		System.out.println(i);

			
		
				
			
			
			
		}

	}



package beecrowd;

import java.util.Scanner;

public class GamewithMin_1047 {

	public static void main(String[] args) {
		//Input 7 8 9 10
		//Output 2 HORA(S) E 2 MINUTO(S)
		//Read the start time and end time of a game, in hours and minutes
		//(initial hour, initial minute, final hour, final minute). 
		// maximum game time of 24 hours and the minimum game time of 1 minute.
		Scanner in = new Scanner(System.in);
		int initial_hour = in.nextInt();
		int initial_min = in.nextInt();
		int final_hour = in.nextInt();
		int final_min = in.nextInt();
		int ih2 = initial_hour * 3600;
		int im2 = initial_min * 60;
		int res1 = ih2+im2;
		int fh2 = final_hour * 3600;
		int fm2 = final_min * 60;
		int res2 = fh2+fm2;
		int res3 = res2-res1;
		
		if(res3<=0) {
			int res4 = 86400-res1;
			int res7 = res2+res4;
			int res8 = res7/3600;
			int res9 = res7%3600;
			int res10 = res9/60;
			System.out.println("O JOGO DUROU "+res8+" HORA(S) E "+res10+" MINUTO(S)");
		}
		else {
			int res4 = res3/3600;
			//System.out.println(res4);
			int res5 = res3%3600;
			int res6 = res5/60;
			//System.out.println(res6);
			System.out.println("O JOGO DUROU "+res4+" HORA(S) E "+res6+" MINUTO(S)");
		}
		

	}

}
// 1 din = 24 ghonta 2 din = 48 ghonta res1,res2
// 10 ghonta 11 min = 36000+660 = 49740 sec bajse
//720+36000 = 49680 sec aro hoile  1 din hbe + 36660 = 86340


package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class runrate1 {
	static DecimalFormat df = new DecimalFormat("0.00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int india_total_run = in.nextInt();
			int bang_total_run = in.nextInt();
			int bang_leftover_balls = in.nextInt();
			double total_balls = 300;
			double balls_played = total_balls - (double) bang_leftover_balls;
			double total_balls_in_over = 6;
			double current_run_rate = total_balls_in_over * ((double) bang_total_run / balls_played);
			double req_run_rate = (((double)(india_total_run + 1) - (double) (bang_total_run))/ (double) bang_leftover_balls) * total_balls_in_over;
			System.out.println(df.format(current_run_rate));
			System.out.println(df.format(req_run_rate));
			
			
		}
		

	}

}

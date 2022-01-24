package beecrowd;

import java.util.Scanner;

public class BEE_1150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//READ TWO INTEGERS
		Scanner in = new Scanner(System.in);
		int X;
		int i = 0;
		//Z MUST BE READ UNTIL BIGGER X APPEARS
		for(;;) {
			
			X = in.nextInt();//3
			for(int Z = in.nextInt(); Z <X;Z++) {
				i++;
				
				
				
			}
			System.out.println(i);
			break;
		}

	}

}

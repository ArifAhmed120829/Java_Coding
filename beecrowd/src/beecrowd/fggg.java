package beecrowd;

import java.util.Scanner;

public class fggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		int N = in.nextInt();//2
		for(int i = 0; i<N;i++) {
			int X = in.nextInt();//11
			int Y = in.nextInt();//2
			
				if(X%2==1) {//11
					sum = 0;
					for(int j = 0; j<Y;j++) {//0<2
						sum = sum + X;//11+13=24
						X = X+2;//13	
				}
				}
				else {
					X= X+1;//5
					sum = 0;
					for(int j = 0; j<Y;j++) {//0<3
						sum = sum + X;//5+7+9=21---Ans done
						X = X+2;	
					
				}
					
		}
				System.out.println(sum);
				

	}

	}

}

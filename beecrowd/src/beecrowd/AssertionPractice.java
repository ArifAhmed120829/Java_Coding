package beecrowd;

import java.util.Scanner;

public class AssertionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int x1 = in.nextInt();
			int x = -1;
			int sum = x + x1;
			System.out.println(sum);
			
			assert sum > 0;
			
		}
	
		
		in.close();

	}

}

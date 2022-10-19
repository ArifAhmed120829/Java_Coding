package beecrowd;

import java.util.Scanner;

public class hello_shit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int[][] arr = new int[3][3];
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i<j) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println(sum);

	}

}

package beecrowd;

import java.util.Scanner;

public class bee_1858 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int[] arr = new int[x];
		for(int i = 0; i<x; i++) {
			arr[i] = in.nextInt();
		}
		//int i = 0; 
		//int j = 1; 5,7,4,5,6,0,8,7,1,2;
		int min = 0;
		int index = 0;
		for(int i = 0; i <x; i++) {//5
			for(int j = 1 ; j<x; j++) {//5<7,5<4,4<
				if(arr[i]<arr[j]) {
					min = arr[i];
				}
				else {
					min = arr[j];
				}
			}
		}
		System.out.println(min);

	}

}

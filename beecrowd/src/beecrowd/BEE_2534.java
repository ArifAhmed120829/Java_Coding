package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BEE_2534 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> result_list = new ArrayList<Integer>();
		line1 = in.readLine().split(" ");
		int x = Integer.parseInt(line1[0]);
		int y = Integer.parseInt(line1[1]);
		for(int i = 0; i<x; i++) {
			int l = input.nextInt();
			list.add(l);
		}
		Collections.sort(list);
		int s = list.size();
		for(int i = 0; i<y; i++) {
			int l2 = input.nextInt();
			result_list.add(list.get(s-l2));
		}
		for(int value: result_list) {
			System.out.println(value);
		}
		in.close();
		input.close();
		

	}

}

package CodeforcesSolving;

import java.util.Scanner;

class vinegar {
	public int sum(int[] arr1, int[] arr2) {
		int len1 = arr1.length;//3
		int len2 = arr2.length;//2
		int[] n_arr1 =arr1;//1,2,3
		int[] n_arr2 = arr2;//4,5
		int[] new_arr =new int[len1];//3
		int s = 0;
		int min ;//1
		int g = n_arr1.length;
		int count = len2;//2
		int min_index = 0;
		while(count != 0) {
			min = n_arr1[0];
			
			for (int i = 0; i < g; i++) {
				if (n_arr1[i] <= min) {
					min = n_arr1[i];//1
					min_index = i;//0
					
				}
				
			}
			for(int i = 0,j=0; i<n_arr1.length;i++) {
				if(i==min_index) {
					continue;
				}
				new_arr[j] = n_arr1[i];//2,3,0
				j++;
			}
			n_arr1 = new_arr;
			count--;
			g--;
		}
		for( int value: new_arr) {
			s =s + value;
		}
		for( int value2: arr2) {
			s =s + value2;
		}
		return s;
		
	
		
		
	}
}

public class Koxia {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int test_case = in.nextInt();// 4
		int[] n_arr;
		int[] m_arr;
		vinegar ob = new vinegar();
		for (int i = 0; i < test_case; i++) {
			int n = in.nextInt();// 3
			int m = in.nextInt();// 2
			n_arr = new int[n];
			m_arr = new int[m];
			for (int j = 0; j < n; j++) {

				n_arr[j] = in.nextInt();// 1,2,3
			}
			for (int k = 0; k < m; k++) {

				m_arr[k] = in.nextInt();// 4,5
			}
			System.out.println(ob.sum(n_arr, m_arr));

		}
	}

}

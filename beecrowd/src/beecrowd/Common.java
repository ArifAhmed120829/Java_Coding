package beecrowd;

import java.util.Arrays;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,5,5,8,9,7,10};
		int[] arr2= {1,0,6,15,6,4,7,0};
		
		System.out.println("Array1: "+Arrays.toString(arr1));
		System.out.println("Array2: "+Arrays.toString(arr2));
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("Common element is: "+arr1[i]);
				}
			}
		}

	}

}

package beecrowd;

import java.util.Arrays;

public class Specific_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {65,77,65,77,65,77};
		System.out.println("Original Array: "+Arrays.toString(array_nums));
		int num1 = 77;
		int num2 = 65;
		System.out.println("Result: "+result(array_nums,num1,num2));

	}
	public static boolean result(int[] array_nums,int num1, int num2) {
		for(int numbers : array_nums) {
			boolean r = numbers != num1 && numbers != num2;
			if(r) {
				return false;
			}
		}
		return true;
		
		
	}

}

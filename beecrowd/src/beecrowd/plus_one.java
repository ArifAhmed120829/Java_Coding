package beecrowd;

import java.util.Arrays;

class emo{
	public int[] plusOne(int[] digits) {
		int length = digits.length;//3
		for(int i = length-1; i>=0; i--) {// i = 2; i = 2,1,0;
			if(digits[i]<9) {
				//digits[2] == no
				digits[i]++;
				return digits;
			}
			 digits[i] = 0;
			//digits[2] == 0;
			//digits[1] == 0;
			//digits[0] == 0;
		}
		int[] new_number = new int[length+1];
		new_number[0] = 1;
		return new_number;
		
		
	}
}

public class plus_one {

	public static void main(String[] args) {
		int[] arr = {9,9,9};
		emo object = new emo();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(object.plusOne(arr)));
		for(int value: object.plusOne(arr)) {
			System.out.println(value);
		}
		

	}

}

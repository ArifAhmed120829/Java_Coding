package beecrowd;

import java.util.ArrayList;
import java.util.HashSet;
class solution781{
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i = 0; i<nums.length; i++) {
			h.add(nums[i]);
		}
		return (h.size() != nums.length) ? true:false;
		
	}
	
}

public class Contains_Duplicate {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4};
		solution781 ob = new solution781();
		System.out.println(ob.containsDuplicate(arr));
	
		

	}

}

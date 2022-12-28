package beecrowd;

import java.util.HashSet;


class solution780{
	public static  int numb = 0;
	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		while(n!=1) {
			int counter = n;
			int sum = 0;
			while(counter!=0) {
				sum += (counter%10) * (counter%10);
				counter = counter/10;
			}
			if(set.contains(sum)) {
				System.out.println(sum);
				return false;
			}
			set.add(sum);
			 n  = sum;
			 numb++;
		}
		return true;
	}
}

public class HappyNumber {
	

	public static void main(String[] args) {
		int num = 2;
		solution780 ob = new solution780();
		System.out.println(ob.isHappy(num));
		System.out.println(solution780.numb);
	}

}


public class sum_of_digits {

	public static void main(String[] args) {
		int x  = 25;
		int mod = 0;
		System.out.println(sum(x,mod));

	}

	private static int sum(int x, int mod) {
		if(x<1) {
			return 0;
		}
		mod = x%10;
		return mod + sum(x/10,mod);
		
	}

}

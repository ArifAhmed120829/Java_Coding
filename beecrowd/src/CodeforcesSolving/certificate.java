package CodeforcesSolving;
class Solution200 {
    public int distinctIntegers(int n) {
    	return n;
        
    }
}


public class certificate {

	public static void main(String[] args) {
		int initial = 6;
		int count  = 1;
		int x;
		while(initial>2) {
			x = initial - 1;
			if(initial%x==1) {
				count++;
				initial = x;
			}
		}
		System.out.println(count);

	}

}

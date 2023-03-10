
public class count {

	public static void main(String[] args) {
		int number  = 50;
		int i = 0;
		c(number,i);
		//System.out.println(i);

	}

	private static void c(int number,int i) {
		if(number<1) {
			System.out.println(i);
			return;
		}
		i++;
		c(number/10,i);
		
		
	}

}

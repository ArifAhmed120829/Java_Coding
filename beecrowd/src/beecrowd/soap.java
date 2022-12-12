package beecrowd;

public class soap {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(rec(a));

	}

	private static int rec(int a) {
		if(a==2) {
			return a;
		}
	
			 return rec(a-1);
			
		
		
	}

}

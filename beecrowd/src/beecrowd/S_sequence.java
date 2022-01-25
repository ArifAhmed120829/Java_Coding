package beecrowd;

public class S_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1
		double sum = 0;
		for(int i = 1; i<=100;i++) {
			sum = sum + (double )1/i;
			
		}
		double res = sum + 1;
		String str = String.format("%.2f", res);
		System.out.println(str);
		*/
		double x;
		double sum = 0;
		double j = 2;
		for(double i = 3; i<=39; i = i+2) {
			x = i/j;
			sum = sum + x;
			j = j*2;
		}
		double res = sum+1;
		String str = String.format("%.2f",res);
		System.out.println(str);

	}

}

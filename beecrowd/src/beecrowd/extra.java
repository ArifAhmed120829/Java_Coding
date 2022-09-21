package beecrowd;

public class extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,number2,res1 = 0,res2 = 0,res3 = 0;
		number = 123;
		if(number/100!=0) {
			res1 = number /100;
			number2 = number%100;
			System.out.println(res1+" "+number2);
		}
		if(res1/10!=0) {
			res2 = res1/10;
			if(res2>1) System.out.println();
		}

	}

}

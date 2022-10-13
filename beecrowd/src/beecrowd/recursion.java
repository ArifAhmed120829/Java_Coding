package beecrowd;
class Factorial{
	//This is a recursive method
	int fact(int n) {
		int result;
		if(n==1) return 1;
		result = fact(n-1) *n;
		return result;
	}
}

public class recursion {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("Factorial of 3 is "+ f.fact(4));

	}

}

package beecrowd;

public class ternary_operator {
	static int max(int a2, int b2) {
		return (a2>b2) ? a2:b2;

	}

	static int min(int a2, int b2) {
		return (a2<b2) ? a2:b2;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 500;
		int c = 300;
		int max2 = (max(a,b)>c) ? max(a,b):c;
		int min2 = (min(a,b)<c) ? min(a,b):c;
		System.out.println("Max Value: "+max2);
		System.out.println("Min Value: "+min2);

	}

}

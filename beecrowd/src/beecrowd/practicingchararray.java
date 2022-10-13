package beecrowd;

public class practicingchararray {

	public static void main(String[] args) {
		char[] a = new char[] {'a','b','c'};
		String c = "";
		for(char value: a ) {
			c = c + value;
		}
		System.out.println(c);
	}

}

package beecrowd;

public class threadsPractice {

	public static void main(String[] args) {
		Thread T = Thread.currentThread();
		System.out.println(T);
		T.setName("My thread");
		System.out.println(T );

	}

}

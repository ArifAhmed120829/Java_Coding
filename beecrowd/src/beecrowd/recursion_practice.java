package beecrowd;

import java.util.Scanner;

public class recursion_practice {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int number  = in.nextInt();
		System.out.println("Fibonacci series upto " + number +" numbers : ");
		for(int i=1; i<=number; i++){
            System.out.print(fibonacci2(i) +" ");
        }

	}

	private static String fibonacci2(int i) {
		
		return null;
	}

}

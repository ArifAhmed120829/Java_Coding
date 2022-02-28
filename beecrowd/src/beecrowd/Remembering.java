package beecrowd;

import java.util.Arrays;

class arif{
	void method2() {
		System.out.println("I created this function");
	}
}
class arif2{
	boolean ifelse(boolean x) {
		if(x==true) {
			System.out.println(x);
			
		}
		else {
			System.out.println(false);
		}
		return x;
		
		
		
	}
}

public class Remembering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		a = 11;
		b = 21;
		int sum,sum2;
		sum2 = 0;
		sum = a+b;
		System.out.println("The sum of a+b is: ");
		System.out.println(sum);
		for(int i = 0; i < 10; i++) {
			sum2 = sum2 + sum;
		}
		System.out.println("sum er 10 gun: ");
		System.out.println(sum2);
		if(sum2%2==0) {
			System.out.println("this number is even");
		}
		else {
			System.out.println("this number is odd");
		}
		arif practice = new arif();
		practice.method2();
		int[] arr = {10,20,3,0,4,155};
		System.out.println(Arrays.toString(arr));
		boolean x = false;
		arif2 practice2 = new arif2();
		practice2.ifelse(x);
		int[] numbers = {3,9,5,-5};
		//for-each loop
		/*
		for(dataType item : array) {
		    ...
		}
		*/
		for(int number: numbers) {
			System.out.println(number);
		}
		String[] arr1 = {"abir","arif","mehedi","tanim","sakil"};
		for(String newString: arr1) {
			System.out.println(newString);
		}

	}

}

package beecrowd;

import java.util.Scanner;

public class Boring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("My Abul Friends: ");
		int age;
		String name;
		name = in.nextLine();
		age = in.nextInt();
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		if(name=="arif") System.out.println("He loves his student");
		if(age>18) {
			System.out.println("He is 18+");
			
		}
		else {
			System.out.println("He is a below 18 years  old");
		}

	}

}

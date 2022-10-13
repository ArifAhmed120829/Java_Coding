package beecrowd;
import java.util.HashMap;
import java.util.Scanner;

public class StringBuilderr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Pls input your gender: ");
		String input = in.next();
		switch(input) {
		case "male": Male();
		break;
		case "female": Female();
		break;
		default: System.out.println("Please Choose Betwwen 'male' & 'female'");
		}
		

	}

	private static void Female() {
		System.out.println("Please Enter your height: ");
		Scanner in = new Scanner(System.in);
		double height = in.nextDouble();
		if(height<5.0) {
			System.out.println("Sorry you are not applicable for this post");
		}
		else {
			System.out.println("You are accepted, Please follow the instruction: ");
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			System.out.println("Your score in math: ");
			int score = in.nextInt();
			map.put("MATH", score);
			if(score<80) {
				System.out.println("try 1 month later");
			}
			else {
				System.out.println("Congratulations you passed, your result is: "+map);
			}
		}
		
	}

	private static void Male() {
		System.out.println("Please Enter your height: ");
		Scanner in = new Scanner(System.in);
		double height = in.nextDouble();
		if(height<5.5) {
			System.out.println("Sorry you are not applicable for this post");
		}
		else {
			System.out.println("You are accepted, Please follow the instruction: ");
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			System.out.println("Your score in math: ");
			int score = in.nextInt();
			map.put("MATH", score);
			if(score<80) {
				System.out.println("try 1 month later");
			}
			else {
				System.out.println("Congratulations you passed, your result is: "+map);
			}
		}
		
	}

}

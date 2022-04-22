package beecrowd;

import java.util.Scanner;

public class onekdinpor {

	public static void main(String[] args) {
		//Gta V Hesit er nam thakbe
		//if the heist name match show the mission of that
		//lastly print an output message
		Scanner in = new Scanner(System.in);
		String[] Heist = {"Prison Break","Casino","Bank","Contact"};
		System.out.println("All Heists Name: ");
		for(String item : Heist) {
			
			System.out.println(item);
			
		}
		String f = in.next();
		if(f.equals("Contact")) {
			System.out.println("Franklin & Lamar");
		}
		else if(f.equals("Casino")) {
			System.out.println("Made by Lester");
		}
		else {
			System.out.println("No match found");
		}
		System.out.println("End");
		
		
		

	}

}

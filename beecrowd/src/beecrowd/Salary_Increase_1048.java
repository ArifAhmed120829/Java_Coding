package beecrowd;

import java.util.Scanner;

public class Salary_Increase_1048 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float money_earned ;
		float New_salary;
		int In_percentage;
		String str,str2;
		float number = in.nextFloat();
		if(0<=number&&number<=400.00) {
			In_percentage = 15;
			money_earned = (number*In_percentage)/100;
			New_salary = number + money_earned;
			str = String.format("%.2f", New_salary);
			str2 = String.format("%.2f", money_earned);
			System.out.println("Novo salario: "+str);
			System.out.println("Reajuste ganho: "+str2);
			System.out.println("Em percentual: "+In_percentage+" %");
		}
		else if(400.01<=number&&number<=800.00) {
			In_percentage = 12;
			money_earned = (number*In_percentage)/100;
			New_salary = number + money_earned;
			str = String.format("%.2f", New_salary);
			str2 = String.format("%.2f", money_earned);
			System.out.println("Novo salario: "+str);
			System.out.println("Reajuste ganho: "+str2);
			System.out.println("Em percentual: "+In_percentage+" %");
		}
		else if(800.01<=number&&number<=1200.00) {
			In_percentage = 10;
			money_earned = (number*In_percentage)/100;
			New_salary = number + money_earned;
			str = String.format("%.2f", New_salary);
			str2 = String.format("%.2f", money_earned);
			System.out.println("Novo salario: "+str);
			System.out.println("Reajuste ganho: "+str2);
			System.out.println("Em percentual: "+In_percentage+" %");
		}
		else if(1200.01<=number&&number<=2000.00) {
			In_percentage = 7;
			money_earned = (number*In_percentage)/100;
			New_salary = number + money_earned;
			str = String.format("%.2f", New_salary);
			str2 = String.format("%.2f", money_earned);
			System.out.println("Novo salario: "+str);
			System.out.println("Reajuste ganho: "+str2);
			System.out.println("Em percentual: "+In_percentage+" %");
		}
		else if(number>2000.00) {
			In_percentage = 4;
			money_earned = (number*In_percentage)/100;
			New_salary = number + money_earned;
			str = String.format("%.2f", New_salary);
			str2 = String.format("%.2f", money_earned);
			System.out.println("Novo salario: "+str);
			System.out.println("Reajuste ganho: "+str2);
			System.out.println("Em percentual: "+In_percentage+" %");
		}
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*The input contains only a floating-point number,
		 *  with 2 digits after the decimal point.
		 *  400*15/100 = 60 400+60 = 460
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */


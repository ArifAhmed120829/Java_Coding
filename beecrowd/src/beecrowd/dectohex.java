package beecrowd;

import java.util.Scanner;

public class dectohex {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		    for(;;) {
		      String n = in.next();
		      int quotient = 0;
		      int remainder;
		      String res = "";
		      if(n.length()>1) {
		        char a = n.charAt(0);
		        char b = n.charAt(1);
		        if(a=='0' && b == 'x') {// hexa to decimal
		          System.out.println("hi");
		        }
		        else {//decimal to hexa
		          int n1 = Integer.valueOf(n);//125
		          if(n1<0) break;//-1 here '-' & '1' so len is 2 Answered
		          while(n1/16!=0) {
		        	  quotient = n1/16;//7
			          remainder = n1%16;//13->d
			          String r1 = String.valueOf(remainder);//string = 13
		            if(remainder<16 && remainder>9) {
		              remainder = hex(remainder);
		              char p = Character.valueOf((char) remainder);
		              res = res + p;
		            }
		            else {
		              res = res + r1;
		            }
		            n1 = quotient;
		            
		          }
		          String q1 = String.valueOf(quotient);//string = 7
		          res = q1+res;
		          System.out.print(res);
		          System.out.println();
		        }
		      }
		      else {
		        System.out.println("0x"+n);
		        
		      }  
		    }

		  }
		  public static int hex(int rem) {
		    if(rem==10) rem = 'A'; 
		    else if(rem == 11) rem ='B';
		    else if(rem == 12) rem ='C';
		    else if(rem == 13) rem ='D';
		    else if(rem == 14) rem ='E';
		    else if(rem == 15) rem ='F';
		    return rem;
		    
		  }

	}



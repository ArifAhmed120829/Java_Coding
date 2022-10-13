package beecrowd;

public class Increment_Or_Decrement {

	public static void main(String[] args) {
		//ex:1
		int x = 42;
		/*In the prefix form the operand is incremented or decremented before the value is obtained for use
		 * in the expression
		 * So x = x+1;
		 * y = x;
		*/
		int y = ++x;
		System.out.println(y);
		//ex:2
		int x2 = 42;
		/*In the postfix form the value of x2 is obtained before the increment operator is executed
		 * So y2 = x2;
		 * x2 = x2+1;
		*/
		int y2 = x2++;
		System.out.println(y2);
		//Exercise
		int a,b,c,d;
		a = 1;
		b = 2;
		c = ++b;
		d = a++;
		c++;
		System.out.println("a= " +a);//2;
		System.out.println("b= " +b);//3
		System.out.println("c= " +c);//4
		System.out.println("d= " +d);//1

	}

}

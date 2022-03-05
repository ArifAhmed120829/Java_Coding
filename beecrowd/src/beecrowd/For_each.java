package beecrowd;

public class For_each {

	public static void main(String[] args) {
		//For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5. 
		//It starts with the keyword for like a normal for-loop.
		//Instead of declaring and initializing a loop counter variable, you declare a 
		//variable that is the same type as the base type of the array, followed by a colon,
		//which is then followed by the array name.
		//In the loop body, you can use the loop variable you created rather than using an indexed array element. 
		//It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)
		//base type of the array : array name{ loop variable };
		int[]arr69 = {10,2,0,2,5};
		for(int item:  arr69) {
			System.out.println(item);
		}
		 

	}

}

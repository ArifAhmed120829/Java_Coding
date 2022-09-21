package beecrowd;

public class threadsss {

	public static void main(String[] args) {
		  // Create object instance of a class that is subclass of Thread class
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread pnt1 =
                new PrintNameThread("A");
       
        // Start the thread by invoking start() method
        System.out.println("Calling start() method of " + pnt1.getName() + " thread");
        pnt1.start();

	}

}

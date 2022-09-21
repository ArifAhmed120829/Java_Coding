package beecrowd;

public class PrintNameThread extends Thread {
	PrintNameThread(String name) {
        super(name);
    }
   
    // Override the run() method of the Thread class.
    // This method gets executed when start() method
    // is invoked.
    public void run() {
        System.out.println("run() method of the " + this.getName() + " thread is called" );
       
        for (int i = 0; i < 10; i++) {
            System.out.print(this.getName());
        }
    }

}

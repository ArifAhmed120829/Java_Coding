package beecrowd;

class mt extends Thread{
	public void run() {
		try {
			//Displaying the thread that is running
			System.out.println("Thread "+Thread.currentThread().getId()+"is running" );
			
		}
		catch(Exception e){
			System.out.println("Exception is caught");
			
		}
	}
}

public class Thread_ex {

	public static void main(String[] args) {
		//A java application is capable to handle multiple threads at the same time
		//All threads of an application belongs to one process
		//We can call a thread sub-process
		int i = 8;
		for(int j = 0; j<i; j++) {
			mt obj = new mt();
			obj.start();
		}

	}

}

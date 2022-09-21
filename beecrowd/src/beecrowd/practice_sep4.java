package beecrowd;

class static_ex{
	//Declaring the static method below
	static void runner() {
		System.out.println("He is running like a mad dog");
	}
}

public class practice_sep4 {
	//Declaring the non-static method below
	 void method1() {
		System.out.println("Hello, I was called from static method");
	}

	public static void main(String[] args) {
		//Calling the non-static method with object reference
		practice_sep4 myobj = new practice_sep4();
		myobj.method1();
		//Calling the static method without any object reference
		static_ex.runner();
		

	}

}

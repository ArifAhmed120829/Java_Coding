package beecrowd;

public class Account {
	 String name;
	  int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a  = new Account();
		/*
		a.name = "Arif";
		a.age = 23;
		it's a bad practice don't use this..instead use getter and setter
		*/
		a.print_value();

	}
	public   void print_value() {
		System.out.println(name + " " + age);
	}

}

package beecrowd;
class Balance{
	String name;
	double bal;
	Balance(String n , double b){
		name = n; bal = b;
	}
	void show() {
		if(bal<0)
			System.out.print("--> ");
		System.out.println(name + ": $" + bal);
	}
}


public class Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balance current[] = new Balance[3];
		current[0] = new Balance("ARIF AHMED",-20000.500);
		current[1] = new Balance("Aurin",50000.90);
		current[2] = new Balance("Ezaz",75000.80);
		for(int i = 0; i<3; i++)
			current[i].show();

	}

}

package beecrowd;

public class Method_Overriding {

	public static void main(String[] args) {
		Sports myobj1 = new Sports();
		Soccer myobj2 = new Soccer();
		
		System.out.println(myobj1.getName());
		myobj1.getNumberOfTeamMembers();
		System.out.println(myobj2.getName());
		myobj2.getNumberOfTeamMembers();

	}

}

package beecrowd;

public class Soccer extends Sports{
	   @Override
	    String getName(){
	        return "Soccer Class";
	    }
	   void getNumberOfTeamMembers(){
	        System.out.println( "Each team has 11 players in " + getName() );
	    }

}

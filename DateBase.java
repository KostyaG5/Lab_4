package Lab4;

public class DateBase {

	
	private static String[] surnames = {"Smith" , "Johnson" , "Williams" , "Jones" , "Brown" , "Davis" , "Miller" , "Wilson"} ; 
	private static String[] еducations = {"Secondary" , "Baccalaureat" , "Expert" , "Magistr"} ;
	private static String[] posts = {"Programmer" , "Accountant" , "Manager" , "Dispatcher" , "Janitor" , "Inspector" , "Secretary"} ;
	
	
	
	private static String[] birthPlaces = {"New York" , "Los Angeles" , "Chicago" , "Washington" , "Boston" , "San Francisco" , "San Diego"};
	private static String[] roles = {"Goalkeeper" , "Defender" , "Midfielder" , "Forward"} ;
			
			
			
			
	 public static String getSurnames() {

	        return surnames[(int) (Math.random() * surnames.length)];
	    }

	 public static String getEducations() {

	        return еducations[(int) (Math.random() * еducations.length)];
	    }
	
	 public static String getPosts() {

	        return posts[(int) (Math.random() * posts.length)];
	    }

	 
	 
	 
	
	  public static String getBirthPlaces() {
		return birthPlaces[(int) (Math.random() * birthPlaces.length)];
	     }

	 public static String getRoles() {
		return roles[(int) (Math.random() * roles.length)];
	     }

	
	
	 
	
	 
}

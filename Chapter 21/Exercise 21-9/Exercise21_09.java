import java.util.*;
import java.util.Scanner;

public class Exercise21_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[][] stateCapital = {
	    	{"Alabama", "Montgomery"},
	    	{"Alaska", "Juneau"},
	    	{"Arizona", "Phoenix"},
	    	{"Arkansas", "Little Rock"},
	    	{"California", "Sacramento"},
	    	{"Colorado", "Denver"},
	    	{"Connecticut", "Hartford"},
	    	{"Delaware", "Dover"},
	    	{"Florida", "Tallahassee"},
	    	{"Georgia", "Atlanta"},
	    	{"Hawaii", "Honolulu"},
	    	{"Idaho", "Boise"},
	    	{"Illinois", "Springfield"},
	    	{"Indiana", "Indianapolis"},
	    	{"Iowa", "Des Moines"},
	    	{"Kansas", "Topeka"},
	    	{"Kentucky", "Frankfort"},
	    	{"Louisiana", "Baton Rouge"},
	    	{"Maine", "Augusta"},
	    	{"Maryland", "Annapolis"},
	    	{"Massachusettes", "Boston"},
	    	{"Michigan", "Lansing"},
	    	{"Minnesota", "Saint Paul"},
	    	{"Mississippi", "Jackson"},
	    	{"Missouri", "Jefferson City"},
	    	{"Montana", "Helena"},
	    	{"Nebraska", "Lincoln"},
	    	{"Nevada", "Carson City"},
	    	{"New Hampshire", "Concord"},
	    	{"New Jersey", "Trenton"},
	    	{"New York", "Albany"},
	    	{"New Mexico", "Santa Fe"},
	    	{"North Carolina", "Raleigh"},
	    	{"North Dakota", "Bismarck"},
	    	{"Ohio", "Columbus"},
	    	{"Oklahoma", "Oklahoma City"},
	    	{"Oregon", "Salem"},
	    	{"Pennsylvania", "Harrisburg"},
	    	{"Rhode Island", "Providence"},
	    	{"South Carolina", "Columbia"},
	    	{"South Dakota", "Pierre"},
	    	{"Tennessee", "Nashville"},
	    	{"Texas", "Austin"},
	    	{"Utah", "Salt Lake City"},
	    	{"Vermont", "Montpelier"},
	    	{"Virginia", "Richmond"},
	    	{"Washington", "Olympia"},
	    	{"West Virginia", "Charleston"},
	    	{"Wisconsin", "Madison"},
	    	{"Wyoming", "Cheyenne"}
	    	};
	    
	    // Create map and store entries
	    Map<String, String> map = new HashMap<>();
	    for (int i = 0; i < stateCapital.length; i++) {
	    	map.put(stateCapital[i][0], stateCapital[i][1]);
	    }
	    
	    // Set up scanner
	    Scanner input = new Scanner(System.in);
	    
	   	// Prompt user to enter state
	    System.out.print("Enter a state: ");
	    String state = input.nextLine();
	    	
	    // Verify if state is in map and output capital
	    if (map.containsKey(state)) {
	    	System.out.println("The capital of " + state + " is " + map.get(state));
	    }
	    else {
	    	System.out.println(state + " is not a state.");
	    }
	    	
	}
}

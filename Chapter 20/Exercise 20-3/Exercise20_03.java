/*
 * Author: Joshua Gray
 * Date: 9/23/21
 * 
 * This program utilizes a multidimensional ArrayList to randomly display 
 * a state name and prompt the user to guess its capital.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise20_03 {

	public static void main(String[] args) {
		// Create 2 dimensional ArrayList
		ArrayList<ArrayList<String>> stateCapital = new ArrayList<>();
		
		// Create state ArrayLists and add to stateCapital
		ArrayList<String> alabama = new ArrayList<>();
		alabama.add("Alabama");
		alabama.add("Montomery");
		stateCapital.add(alabama);
		ArrayList<String> alaska = new ArrayList<>();
		alaska.add("Alaska");
		alaska.add("Juneau");
		stateCapital.add(alaska);
		ArrayList<String> arizona = new ArrayList<>();
		arizona.add("Arizona");
		arizona.add("Pheonix");
		stateCapital.add(arizona);
		ArrayList<String> arkansas = new ArrayList<>();
		arkansas.add("Arkansas");
		arkansas.add("Little Rock");
		stateCapital.add(arkansas);
		ArrayList<String> colorado = new ArrayList<>();
		colorado.add("Colorado");
		colorado.add("Denver");
		stateCapital.add(colorado);
		ArrayList<String> connecticut = new ArrayList<>();
		connecticut.add("Connecticut");
		connecticut.add("Hartford");
		stateCapital.add(connecticut);
		ArrayList<String> delaware = new ArrayList<>();
		delaware.add("Delaware");
		delaware.add("Dover");
		stateCapital.add(delaware);
		ArrayList<String> florida = new ArrayList<>();
		florida.add("Florida");
		florida.add("Tallahassee");
		stateCapital.add(florida);
		ArrayList<String> georgia = new ArrayList<>();
		georgia.add("Georgia");
		georgia.add("Atlanta");
		stateCapital.add(georgia);
		ArrayList<String> hawaii = new ArrayList<>();
		hawaii.add("Hawaii");
		hawaii.add("Hanolulu");
		// Insert rest of states here:
		
		// Shuffle stateCapital
		Collections.shuffle(stateCapital);
		
		
		// Guessing game
		Scanner input = new Scanner(System.in);
		int correctCount = 0;
		
		for (int i = 0; i < stateCapital.size(); i++) {
			// Prompt the user with a question
			System.out.print("What is the capital of " + 
					stateCapital.get(i).get(0) + "? ");
			String capital = input.nextLine().trim().toLowerCase();
			
			if (capital.toLowerCase().equals(stateCapital.get(i).get(1).toLowerCase())) {
				System.out.println("Your answer is correct");
				correctCount++;
			}
			else {
				System.out.println("The correct answer should be " + 
						stateCapital.get(i).get(1));
			}
			
			System.out.println("The correct count is " + correctCount);
		}
	}

}

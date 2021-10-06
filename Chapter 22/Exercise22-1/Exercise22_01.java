/*
 * Author: Joshua Gray
 * Date: 10/5/21
 * 
 * This program prompts the user to enter a string and then 
 * outputs the maximum consecutive substring of it.
 */
import java.util.Scanner;
import java.util.*;

public class Exercise22_01 {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user
		System.out.print("Enter a string: ");
		String userString = input.nextLine();
		
		// Output maximum consecutive substring
		System.out.println("Maximum consecutive substring is " + maxSubstring(userString));
	}
	
	public static String maxSubstring(String userString) {
		// Convert userString to ArrayList of characters
		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c: userString.toCharArray()) {
			chars.add(c);
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0, j = 1; i < chars.size() && j < chars.size(); i++, j++) {
			if (chars.get(i) < chars.get(j)) {
				System.out.println("WORKING ON IT");
			}
		}
		
		return userString;
	}
	
}

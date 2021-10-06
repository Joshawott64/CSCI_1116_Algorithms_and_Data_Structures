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
		
		// Find greatest substring
		String greatestSub = "";
		StringBuilder stringBuilder = new StringBuilder(greatestSub);
		for (int i = 0; i < chars.size(); i++) {
			if (chars.get(i) < chars.get(i + 1)) {
				stringBuilder.append(chars.get(i));
			}
		}
		return greatestSub;
	}

}

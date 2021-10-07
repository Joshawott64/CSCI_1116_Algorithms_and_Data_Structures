/*
* Author: Joshua Gray
* Date: 10/7/21
* 
* This program prompts the user to enter two strings and determines whether or not the second string 
* is a substring of the first and returns the index of the substring if it is.
*/

import java.util.*;

public class Exercise22_03 {
	public static void main(String[] args) {
		// Set up Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user
		System.out.print("Enter a string s1: ");
		String s1 = input.nextLine();
		System.out.print("Enter a string s2: ");
		String s2 = input.nextLine();
		
		
		// Test for substring
		int index = 0;
		for (int i = 0, j = 1; i < s1.length() && j < s2.length(); i++) {
			// Find first letter index
			if (s2.charAt(0) == s1.charAt(i) && s1.contains(s2)) {
				index = i;
			}
			// Check if letters match after index
			if (s2.charAt(j) == s1.charAt(i)) {
				j++;
			}
			else {
				index = i;
			}
		}
		
		System.out.println("matched at " + index);
	}
}

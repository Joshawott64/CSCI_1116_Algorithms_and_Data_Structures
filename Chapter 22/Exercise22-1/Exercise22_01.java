/*
 * Author: Joshua Gray
 * Date: 10/5/21
 * 
 * This program prompts the user to enter a string and then 
 * outputs the maximum consecutive substring of it.
 */
import java.util.Scanner;
import java.util.*;
import java.awt.*;

public class Exercise22_01 {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		
		// Create lists
		LinkedList<Character> max = new LinkedList<>();
		LinkedList<Character> list = new LinkedList<>();
		
		// Prompt user
		System.out.print("Enter a string: ");
		String userString = input.nextLine();
		
		// Output maximum consecutive substring
		System.out.println("Maximum consecutive substring is " + maxSubstring(userString, max, list));
	}
	
	public static String maxSubstring(String userString, LinkedList<Character> max, LinkedList<Character> list) {
		for (int i = 0; i < userString.length(); i++) {
			if (list.size() > 1 && userString.charAt(i) <= list.getLast() && list.contains(userString.charAt(i))) {
				list.clear();
			}
			
			list.add(userString.charAt(i));
			
			if (list.size() > max.size()) {
				max.clear();
				max.addAll(list);
			}
		}
		
		StringBuilder finishedString = new StringBuilder();
		for (Character ch: max) {
			finishedString.append(ch);
		}
		return finishedString.toString();
	}
	
}

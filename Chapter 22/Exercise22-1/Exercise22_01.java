/*
 * Author: Joshua Gray
 * Date: 10/5/21
 * 
 * This program prompts the user to enter a string and then 
 * outputs the maximum consecutive substring of it.
 */
import java.util.Scanner;
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
		char a = userString.charAt(0);
		char b = userString.charAt(1);
		if (Character.toLowerCase(a) < Character.toLowerCase(b)) {
			System.out.println(a + " < " + b);
		}
		return userString;
	}

}

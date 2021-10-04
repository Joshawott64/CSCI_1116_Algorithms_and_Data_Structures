import java.util.*;

public class CountOccurrenceOfWords {

	public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " + 
				"Have a good visit. Have fun!";
		
		// Create a HashMap to hold words as key and count as value
		Map<String, Integer> map = new HashMap<>();
		
		// Create an ArrayList for holding instances of WordOccurrence
		ArrayList<WordOccurrence> list = new ArrayList<>();
		
		String[] words = text.split("[\\s+\\p{P}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		
		// Create and add an instance of WordOccurence for each pair in map
		map.forEach((key, value) -> list.add(new WordOccurrence(key, value)));
		
		// Sort list
		Collections.sort(list);
		Collections.reverse(list);
		
		// Display list
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getWord() + "\t" + 
					list.get(i).getCount());
		}
	}
}

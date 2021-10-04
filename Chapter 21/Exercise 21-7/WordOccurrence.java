
public class WordOccurrence implements Comparable<Object> {
	// Data fields
	String word;
	int count;
	
	// Default constructor
	public WordOccurrence() {
	}
	
	// Constructor with specified word and count
	public WordOccurrence(String newWord, int newCount) {
		word = newWord;
		count = newCount;
	}
	
	// Return word
	public String getWord() {
		return word;
	}
	
	// Return count
	public int getCount() {
		return count;
	}

	@Override
	public int compareTo(Object o) {
		if (count == ((WordOccurrence) o).getCount()) {
			return 0;
		}
		else if (count < ((WordOccurrence) o).getCount()) {
			return -1;
		}
		else {
			return 1;
		}
		
	}
}

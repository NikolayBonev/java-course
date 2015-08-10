import java.util.*;

public class UniqueWords {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.println("Enter text: ");
		
		String text = inputs.nextLine();
		
		printUniqueWords(text);
		
		inputs.close();
	}

	
	public static void printUniqueWords(String text){
		String[] words = text.toLowerCase().split("[\\W\\s]");
		
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
		
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}

			wordsCount.put(word, count + 1);
		}
		
		Set<String> wordKeys = wordsCount.keySet();
		
		System.out.println();
		
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			if(count==1){
				System.out.printf("%s\n", word);
			}
		}
	}

}

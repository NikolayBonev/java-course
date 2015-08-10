import java.util.*;

public class CountOfWords {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.println("Enter 20 words: ");
		
		String[] words= new String[20];
		
		for(int i = 0 ; i<words.length  ; i++){
			System.out.print("Enter word number " + (i+1) + ":");
			words[i] = inputs.nextLine();
		}
		
		inputs.close();

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
			System.out.printf("%s -> %d times\n", word, count);
		}
		
	}

}

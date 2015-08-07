import java.util.Scanner;
import java.util.regex.*;

public class CountOfWordInText2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter sentence in wich will be searched a word: ");
		String strIn = inputs.nextLine();
		
		System.out.print("Enter the word wich will be searched: ");
		String searWord = inputs.nextLine();
		
		System.out.printf("The word \"%s\" is found %d times!", searWord, timesWordFound(strIn, searWord));

		inputs.close();
	}
	
	public static int timesWordFound(String strIn, String subStr){
		
		Pattern pattern = Pattern.compile(subStr); 
		Matcher matcher = pattern.matcher(strIn);
		
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		
		return count;
	}

}

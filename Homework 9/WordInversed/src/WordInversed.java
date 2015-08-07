import java.util.Scanner;

public class WordInversed {

	public static void main(String[] args) {
		
		String word = inputText();
		System.out.println("Reversed version of the word " + word + " is: " + reversedWord(word));
		
		
	}
	
	public static String inputText(){
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter the word wich will be reversed: ");
		String word = inputs.nextLine();
		
		inputs.close();
		return word;
	}
	
	public static String reversedWord(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i >= 0; i--){
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}

}

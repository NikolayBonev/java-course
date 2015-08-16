//import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalSort {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter string: ");
		
		String text = inputs.nextLine().replaceAll("[\\W\\s]+", " ");
		
//		Test text.
//		String text = "Physically, a mouse consists of an object held in one's hand, with one or more buttons.";
//		text = text.replaceAll("[\\W\\s]+", " ");
		
//		System.out.println(text);
		
		String[] arrayText = text.split("[\\s]");
		
//		Using standard library
//		Arrays.sort(arrayText, String.CASE_INSENSITIVE_ORDER);
		
//		Using bubble sort
		BubbleSort sort = new BubbleSort();
		sort.bubbleSortString(arrayText);
		
		System.out.println();
		
		printArray(arrayText);
		
		inputs.close();

	}
	
	public static void printArray(String[] arrayText){
		for(int i = 0 ; i < arrayText.length ; i++){
			System.out.println(arrayText[i]);
		}
	}

}

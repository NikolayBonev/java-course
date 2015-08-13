import java.util.Scanner;
import java.util.Stack;

public class ReversedSen2 {
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter sentence: ");
		String text = inputs.nextLine().replaceAll("[\\W\\s]", " ");
		
//		Test string
//		String text = "I am from planet Earth".replaceAll("[\\W\\s]", " ");
		
		String[] arrayText = text.split("[\\s+]");
		
//		for(int i = 0 ; i < arrayText.length ; i++){
//			System.out.println(arrayText[i]);
//		}
		
		Stack<String> textStack = new Stack<String>();
		
		for(int i = 0 ; i < arrayText.length ; i++){
			textStack.push(arrayText[i]);
		}
		
		while(!textStack.isEmpty()){
			System.out.print(textStack.pop() + " ");
		}
		
		inputs.close();

	}
}

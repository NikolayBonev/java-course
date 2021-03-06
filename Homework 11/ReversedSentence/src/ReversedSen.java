import java.util.Scanner;
import java.util.Stack;

public class ReversedSen {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter sentence: ");
		String text = inputs.nextLine();
		
//		Test string
//		String text = "I am from planet Earth";
		
		String[] arrayText = text.split("[\\W\\s]");
		
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

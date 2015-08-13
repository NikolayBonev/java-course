import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveWordWith3Char {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter text: ");
		
		String text = inputs.nextLine().replaceAll("[\\W\\s]", " ");
		
//		Test string
//		String text = "My spaceship is ready for travelling to Mars";
		
		String[] textArray = text.split("[\\s+]");
		
		Queue<String> textWithRemovedWords = new LinkedList<String>();
		
		for(int i = 0 ; i < textArray.length ; i++){
			if(textArray[i].length() > 3){
				textWithRemovedWords.offer(textArray[i]);
			}
		}
		
		while(!textWithRemovedWords.isEmpty()){
			System.out.print(textWithRemovedWords.poll() + " ");
		}

	}

}

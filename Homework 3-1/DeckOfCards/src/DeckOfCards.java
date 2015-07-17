import java.util.Scanner;

public class DeckOfCards {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter a card from the deck: ");
		
		if(inputs.hasNext("[AJKQajkq]")){
			System.out.println("Валидна карта!");
			//System.out.println("Valid card!");
		}else if(inputs.hasNextInt()){
			int cardNumDeck=inputs.nextInt();
			
			if(cardNumDeck >= 2 && cardNumDeck <= 10){
				System.out.println("Валидна карта!");
				//System.out.println("Valid card!");
			}else{
				System.out.println("Невалидна карта!");
				//System.out.println("Invalid card!");
			}
		}else{
			System.out.println("Невалидна карта!");
			//System.out.println("Invalid card!");
		}
		
		inputs.close();
	}

}

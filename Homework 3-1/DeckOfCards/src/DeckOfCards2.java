import java.util.Scanner;

public class DeckOfCards2 {

	public static void main(String[] args) {
Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter a card from the deck: ");
		
		String cardNumDeck=inputs.nextLine();

		switch (cardNumDeck) {
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "j":
		case "Q":
		case "q":
		case "A":
		case "a":
		case "K":
		case "k":
			System.out.println("Валидна карта!");
			//System.out.println("Valid card!");
			break;

		default:
			System.out.println("Невалидна карта!");
			//System.out.println("Invalid card!");
			break;
		}
		
		inputs.close();

	}

}

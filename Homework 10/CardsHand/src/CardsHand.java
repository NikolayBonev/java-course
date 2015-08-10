import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CardsHand {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		String[] cards = new String[5];
		
		System.out.println("Enter hand of the player: ");
		
		for(int i =0 ; i < 5; i++){
			System.out.println("Enter card " + (i+1) + " : ");
			cards[i] = inputs.nextLine();
		}
		
		checkHand(cards);
		
		inputs.close();

	}
	
	public static void checkHand(String[] cards){
		HashMap<String, Integer> kindCard = new HashMap<String, Integer>();
		
		for (String card : cards) {
			Integer count = kindCard.get(card);
			if (count == null) {
				count = 0; 
			}
			kindCard.put(card, count + 1);
		}
		
		Set<String> kindCards = kindCard.keySet();
		
		int countPairs = 0;
		for (String card : kindCards) {
			int count = kindCard.get(card);
			
			if(count == 2 ){
				if(countPairs == 0){
					System.out.printf("You have a pair!");
					countPairs++;
				}else if(countPairs == 1){
					System.out.printf("You have a two pair!");
					countPairs++;
				}
			}else if(count == 3){
				System.out.printf("You have a set!");
			}else if (count == 4){
				System.out.println("Four of a kind!");
			}
		}
	}

}
